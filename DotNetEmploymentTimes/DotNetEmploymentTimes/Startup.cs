using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(DotNetEmploymentTimes.Startup))]
namespace DotNetEmploymentTimes
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
