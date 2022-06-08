using System;
using mymath;

class calc
{
    public static void Main()
    {
        int firstNum, secondNum, sum, multip;
        String sign;
        int res;

        Console.Write("Enter A = ");
        firstNum = Int32.Parse(Console.ReadLine());
        Console.Write("Enter B = ");
        secondNum = Int32.Parse(Console.ReadLine());
        Console.Write("Sign = ");
        sign = Console.ReadLine();

        if (sign == "+")
        {
            res = ForAdd.add(x, y);
            Console.WriteLine("Sum = {0}", res);
        }
        else if (sign == "*")
        {
            res = ForAdd.multi(x, y);
            Console.WriteLine("Product = {0}", res);
        }
    }
}