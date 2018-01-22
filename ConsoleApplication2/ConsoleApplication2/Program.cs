using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            IA obj1 = new C();
            obj1.GetData();

            IB obj2 = new C();
            obj2.GetData();


            Drived abc = new Drived();
            abc.GetData();
            Console.ReadKey();
        }
    }

    interface IA
    {
        void GetData();
        
    }
    interface IB
    {
        void GetData();        
    }

    public class C :IA, IB
    {
        void IA.GetData()
        {
            Console.WriteLine("Interface A");
        }

        void IB.GetData()
        {
            Console.WriteLine("Interface B");
        }
    }


    public abstract class Base
    {
        public virtual void GetData()
        {
            Console.WriteLine("I am base");
        }
    }

    public class Drived: Base
    {
        public override void GetData()
        {
            Console.WriteLine("I am Drived");
        }
    }
}
