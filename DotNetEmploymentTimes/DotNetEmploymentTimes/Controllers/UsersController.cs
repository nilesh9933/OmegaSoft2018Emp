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

        [HttpGet]
        public String Login(string userName, string password)
        {
            bool isAuthen = false;

            string str = "";
            Dao.Users obj = new Dao.Users();
            isAuthen= obj.Login(userName,password);

            if(isAuthen)
            {
                str = "Go Ahead";
            }
            else
            {
                str = "Sorry";
            }
            return str;
        }
    }
}