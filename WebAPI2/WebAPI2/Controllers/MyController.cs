﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace WebAPI2.Controllers
{
    public class MyController : ApiController
    {

        public String Get()
        {
            return "Hello World!";
        }
    }
}
