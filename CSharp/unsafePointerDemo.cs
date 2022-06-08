using System;

class myClass
{
    public unsafe void method()
    {
        int x = 10;
        int y = 10;
        int* ptr1 = &x;
        int* ptr2 = &y;
        Console.WriteLine((int)ptr1);
        Console.WriteLine((int)ptr2);
        Console.WriteLine(*ptr1);
        Console.WriteLine(*ptr2);
    }
}

class main
{
    public static void Main()
    {
        myClass m = new myClass();
        m.method();
    }
}