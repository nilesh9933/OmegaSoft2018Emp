using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MySql.Data.MySqlClient;

namespace DotNetEmploymentTimes.Utils
{
    public  class MySQLEMPConnection
    {
        static MySqlConnection con = null;
        public static MySqlConnection GetConnection()
        {
            try
            {
                if (con == null)
                {
                     con = new MySqlConnection("SERVER=localhost;DATABASE=EMPDB;UID=root;PASSWORD=sa;");
                }
                else
                {
                    return con;
                }

            }
            catch (Exception e)
            {
                throw;
            }

            return con;
        }

    }
}