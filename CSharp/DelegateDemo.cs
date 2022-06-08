using System;

public delegate int myClass(int x, int y);

public class DelDemo
{
    public static int Add(int x, int y)
    {
        return (x + y);
    }
    public static int product(int x, int y)
    {
        return (x * y);
    }
}

class main
{
    public static void Main()
    {
        myClass d1 = new myClass(DelDemo.Add);
        int resA = d1(5, 5);
        Console.WriteLine("Result of Add = {0}", resA);
        myClass d2 = new myClass(DelDemo.product);
        int resP = d2(5, 5);
        Console.WriteLine("Result of Product = {0}", resP);
    }
}