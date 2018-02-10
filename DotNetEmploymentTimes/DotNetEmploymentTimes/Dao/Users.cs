using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MySql.Data.MySqlClient;
using System.Data;
using DotNetEmploymentTimes.Utils;
using DotNetEmploymentTimes.Controllers;

namespace DotNetEmploymentTimes.Dao
{
    public class Users
    {
        MySqlConnection con;
        public Users()
        {
            con = MySQLEMPConnection.GetConnection();
        }
        public LoginDetails Login(string userName, string password)
        {

            LoginDetails output = new LoginDetails();

            try
            {
                using (MySqlCommand cmd = new MySqlCommand("select userFirstName ,userLastName,userEmail,B.rolName " +
                "from users as A join roles as B on A.rolId=B.rolId where userEmail=@userEmail and userPassword=@userPassword",con))
                {
                    con.Open();
                    cmd.Parameters.AddWithValue("@userEmail", userName);
                    cmd.Parameters.AddWithValue("@userPassword", password);
                    MySqlDataAdapter da=new MySqlDataAdapter (cmd);                                    
                    DataSet ds = new DataSet();
                    da.Fill(ds);
                    if (ds.Tables[0].Rows.Count > 0)
                    {
                        output.firstName = ds.Tables[0].Rows[0]["userFirstName"].ToString();
                        output.lastName = ds.Tables[0].Rows[0]["userLastName"].ToString();
                        output.email= ds.Tables[0].Rows[0]["userEmail"].ToString();
                        output.role = ds.Tables[0].Rows[0]["rolName"].ToString();
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