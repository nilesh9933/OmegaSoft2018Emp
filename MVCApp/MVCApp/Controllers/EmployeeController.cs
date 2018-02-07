using MVCApp.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCApp.Controllers
{
    public class EmployeeController : Controller
    {
        [HttpGet]
        public ActionResult Employee()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Employee(EmployeeModel emp)
        {
            return View();
        }

    }
}
