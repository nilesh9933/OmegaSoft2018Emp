using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace DotNetEmploymentTimes.Controllers
{
    public class UsersController : Controller
    {
        // GET: Users
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public String Login(string userName, string password)
        {
            string output = string.Empty;
            Dao.Users obj = new Dao.Users();
            output = obj.Login(userName, password);
            return output;
        }
    }
}