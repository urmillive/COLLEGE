using System;

class test
{
    public static void Main()
    {
        string gender;
        int sal, ta, da, netsal;
        Console.WriteLine("Enter Gender : ");
        gender = Console.ReadLine();
        Console.WriteLine("Enter Salary : ");
        sal = Int32.Parse(Console.ReadLine());
        if (gender == "M")
        {
            if (sal < 10000)
            {
                ta = (sal * 5) / 100;
                da = (sal * 10) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
            else if (sal >= 10000 && sal < 60000)
            {
                ta = (sal * 6) / 100;
                da = (sal * 11) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
            else if (sal >= 60000)
            {
                ta = (sal * 7) / 100;
                da = (sal * 12) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
        }
        if (gender == "F")
        {
            if (sal < 10000)
            {
                ta = (sal * 4) / 100;
                da = (sal * 9) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
            else if (sal >= 10000 && sal < 60000)
            {
                ta = (sal * 5) / 100;
                da = (sal * 10) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
            else if (sal >= 60000)
            {
                ta = (sal * 6) / 100;
                da = (sal * 11) / 100;
                netsal = sal + ta + da;
                Console.WriteLine("Your Total Salary is : {0}", netsal);
            }
        }
    }
}