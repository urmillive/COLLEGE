using System;

class world
{
    public int a, b, c;
    public void addition(int x, int y)
    {
        a = x;
        b = y;
        c = a + b;
        Console.WriteLine("Addition = {0}", c);
    }

}

class main
{
    public static void Main()
    {
        world w = new world();
        w.addition(10, 20);
    }
}