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
        public String Login(string userName, string password)
        {
            string output = "";
            try
            {
                using (MySqlCommand cmd = new MySqlCommand("select userFirstName,userLastName,userEmail from users where userEmail=@userEmail and userPassword=@userPassword",con))
                {
                    con.Open();
                    cmd.Parameters.AddWithValue("@userEmail", userName);
                    cmd.Parameters.AddWithValue("@userPassword", password);
                    MySqlDataAdapter da=new MySqlDataAdapter (cmd);                                    
                    DataSet ds = new DataSet();
                    da.Fill(ds);

                    if (ds.Tables[0].Rows.Count > 0)
                    {
                        output = ds.Tables[0].Rows[0]["userFirstName"].ToString() + "," + ds.Tables[0].Rows[0]["userLastName"].ToString() + "," + ds.Tables[0].Rows[0]["userEmail"].ToString();
                    }
                    da.Dispose();
                    con.Close();
                }

            }
            catch (Exception e)
            {
                
                throw;
            }

            return output;
        }

    }
}