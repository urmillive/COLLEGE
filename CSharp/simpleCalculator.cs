using System;

public class calc
{
    public static void Main()
    {
        int val1, val2, res;
        string optr;
        Console.Write("Enter First Value = ");
        val1 = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Second Value = ");
        val2 = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Operator(+,-,*,/) = ");
        optr = Console.ReadLine();

        if (optr == "+")
        {
            res = val1 + val2;
            Console.WriteLine("{0} {1} {2} = {3}", val1, optr, val2, res);
        }
        else if (optr == "-")
        {
            res = val1 - val2;
            Console.WriteLine("{0} {1} {2} = {3}", val1, optr, val2, res);
        }
        else if (optr == "*")
        {
            res = val1 * val2;
            Console.WriteLine("{0} {1} {2} = {3}", val1, optr, val2, res);
        }
        else if (optr == "/")
        {
            res = val1 / val2;
            Console.WriteLine("{0} {1} {2} = {3}", val1, optr, val2, res);
        }
        else
        {
            Console.WriteLine("Enter Proper Operator !!");
        }
    }
}