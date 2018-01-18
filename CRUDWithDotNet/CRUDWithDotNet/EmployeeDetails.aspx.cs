using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace CRUDWithDotNet
{
    public partial class EmployeeDetails : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            try
            {
                SqlConnection con = new SqlConnection("Data Source=JAIMA;Initial Catalog=test;Integrated Security=True");
                con.Open();
                SqlCommand cmd = new SqlCommand("insert into (username,firstname,lastname,email,address,dob,password,del_ind) values(@username,@firstname,@lastname,@email,@address,@dob,@password,@del_ind)", con);
                cmd.Parameters.AddWithValue("@username",empemail.Value);
                cmd.Parameters.AddWithValue("@firstname", firstName.Value);
                cmd.Parameters.AddWithValue("@lastname", lastName.Value);
                cmd.Parameters.AddWithValue("@email", empemail.Value);
                cmd.Parameters.AddWithValue("@address", empaddress.Value);
                cmd.Parameters.AddWithValue("@dob","01/01/2017");
                cmd.Parameters.AddWithValue("@password", empemail.Value);
                cmd.Parameters.AddWithValue("@del_ind", "N");
                cmd.ExecuteNonQuery();
                con.Close();
                Response.Write("Data has been inserted successfully.");
            }
            catch (Exception)
            {
                
                throw;
            }

        }

        protected void btnSubmit_Click1(object sender, EventArgs e)
        {
            try
            {
                SqlConnection con = new SqlConnection("Data Source=JAIMA;Initial Catalog=test;Integrated Security=True");
                con.Open();
                SqlCommand cmd = new SqlCommand("insert into (username,firstname,lastname,email,address,dob,password,del_ind) values(@username,@firstname,@lastname,@email,@address,@dob,@password,@del_ind)", con);
                cmd.Parameters.AddWithValue("@username", empemail.Value);
                cmd.Parameters.AddWithValue("@firstname", firstName.Value);
                cmd.Parameters.AddWithValue("@lastname", lastName.Value);
                cmd.Parameters.AddWithValue("@email", empemail.Value);
                cmd.Parameters.AddWithValue("@address", empaddress.Value);
                cmd.Parameters.AddWithValue("@dob", "01/01/2017");
                cmd.Parameters.AddWithValue("@password", empemail.Value);
                cmd.Parameters.AddWithValue("@del_ind", "N");
                cmd.ExecuteNonQuery();
                con.Close();
                Response.Write("Data has been inserted successfully.");
            }
            catch (Exception)
            {

                throw;
            }
        }
    }
}