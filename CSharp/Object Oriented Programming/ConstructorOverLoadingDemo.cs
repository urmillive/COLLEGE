using System;

class Cold
{
    int i, j, k, l;
    public Cold()
    {
        i = j = k = l = 0;
    }
    public Cold(int a, int b, int c = 0, int d = 0)
    {
        i = a;
        j = b;
        k = c;
        l = d;
        Console.WriteLine("Sum = " + (a + b + c + d));
    }
    public Cold(int a)
    {
        i = a;
        Console.WriteLine("Square of {0} is : {1}", a, a * a);
    }

}

class main
{
    public static void Main()
    {
        Cold x = new Cold(5, 5);
        Cold y = new Cold(1, 2, 3);
        Cold z = new Cold(10, 10, 10, 10);
    }
}