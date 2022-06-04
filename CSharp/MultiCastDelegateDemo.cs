using System;

public delegate void multiCastDel(int x, int y);

public class myClass
{
    public static void Add(int x, int y)
    {
        Console.WriteLine("You are in Add");
        Console.WriteLine("{0} + {1} = {2}", x, y, x + y);
    }
    public static void Multiply(int x, int y)
    {
        Console.WriteLine("You are in Multiply");
        Console.WriteLine("{0} * {1} = {2}", x, y, x * y);
    }
}

class main
{
    static void Main()
    {
        multiCastDel del = new multiCastDel(myClass.Add);
        del += new multiCastDel(myClass.Multiply);
        Console.WriteLine("Calling Add and Multiply Method");
        del(5, 5);
        del -= new multiCastDel(myClass.Add);
        Console.WriteLine("Removed Add");
        del(2, 2);
    }
}