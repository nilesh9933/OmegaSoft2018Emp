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
        public JsonResult Login(LoginModel login)
        {

            LoginDetails output = new LoginDetails();

            Dao.Users obj = new Dao.Users();
            output = obj.Login(login.userName, login.password);
            
            return Json(output);
        }
    }

    [Serializable]
    public class LoginModel
    {
        public string userName { get; set; }
        public string password { get; set; }
    }

 
    public class LoginDetails
    {
        public string firstName { get; set; }
        public string lastName { get; set; }
        public string email { get; set; }
        public string role { get; set; }
    }
}