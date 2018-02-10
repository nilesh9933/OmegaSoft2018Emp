using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CRUDWithDotNet
{
    public class ConstantClass
    {
        //SQL Statement
        public static string EMPLOYEE_INSERT = "insert into users (username,firstname,lastname,email,address,dob,password,del_ind) values(@username,@firstname,@lastname,@email,@address,@dob,@password,@del_ind)";

    }
}