using System;

class overDemo
{
    public void ovrBlock()
    {
        Console.WriteLine("No Parameter!!!");
    }
    public void ovrBlock(int a)
    {
        Console.WriteLine("One Parameter = " + a);
    }
    public int ovrBlock(int a, int b)
    {
        Console.WriteLine("Two Parameter {0} & {1}", a, b);
        return (a + b);
    }
    public double ovrBlock(double a, double b)
    {
        Console.WriteLine("Two Double Parameter {0} & {1}", a, b);
        return (a + b);
    }
}

class main
{
    public static void Main()
    {
        overDemo obj = new overDemo();
        int resI;
        double resD;
        obj.ovrBlock();
        Console.WriteLine();
        obj.ovrBlock(5);
        Console.WriteLine();
        resI = obj.ovrBlock(5, 3);
        Console.WriteLine(resI);
        resD = obj.ovrBlock(7.1, 2.32);
        Console.WriteLine(resD);
    }
}