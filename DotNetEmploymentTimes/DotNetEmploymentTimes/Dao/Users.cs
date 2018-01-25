using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MySql.Data.MySqlClient;
using System.Data;
using DotNetEmploymentTimes.Utils;

namespace DotNetEmploymentTimes.Dao
{
    public class Users
    {
        MySqlConnection con;
        public Users()
        {
            con = MySQLEMPConnection.GetConnection();
        }
        public bool Login(string userName, string password)
        {
            bool isAuthen = false;
            try
            {
                using (MySqlCommand cmd = new MySqlCommand("select * from users where userEmail=@userEmail and userPassword=@userPassword",con))
                {
                    con.Open();
                    cmd.Parameters.AddWithValue("@userEmail", userName);
                    cmd.Parameters.AddWithValue("@userPassword", password);
                    MySqlDataAdapter da=new MySqlDataAdapter (cmd);                                    
                    DataSet ds = new DataSet();
                    da.Fill(ds);

                    if (ds.Tables[0].Rows.Count > 0)
                    {
                        isAuthen = true;
                    }
                    da.Dispose();
                    con.Close();
                }

            }
            catch (Exception e)
            {
                
                throw;
            }

            return isAuthen;
        }

    }
}