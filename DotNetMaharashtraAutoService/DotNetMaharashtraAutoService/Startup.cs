using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(DotNetMaharashtraAutoService.Startup))]
namespace DotNetMaharashtraAutoService
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
