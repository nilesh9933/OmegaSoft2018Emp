using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace CRUDWithDotNet
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            try
            {
                using (SqlConnection con = new SqlConnection("Data Source=JAIMA;Initial Catalog=test;Integrated Security=True"))
                {
                    using (SqlCommand cmd = new SqlCommand(ConstantClass.EMPLOYEE_INSERT, con))
                    {
                        con.Open();
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
                }
            }
            catch (Exception)
            {

                throw;
            }

        }
    }
}