using System;

class World
{
    int i, j, k;
    public World()
    {
        i = j = k = 0;
    }
    public World(int a, int b, int c)
    {
        i = a;
        j = b;
        k = c;
    }

    public static World operator +(World ob1, World ob2)
    {
        World result = new World();
        result.i = ob1.i + ob2.i;
        result.j = ob1.j + ob2.j;
        result.k = ob1.k + ob2.k;
        return result;
    }
    public static World operator -(World ob1, World ob2)
    {
        World result = new World();
        result.i = ob1.i - ob2.i;
        result.j = ob1.j - ob2.j;
        result.k = ob1.k - ob2.k;
        return result;
    }
    public void show()
    {
        Console.WriteLine(i + " " + j + " " + k);
    }
}

class main
{
    public static void Main()
    {
        World x = new World(1, 2, 3);
        World y = new World(10, 10, 10);
        World z = new World();
        Console.WriteLine("Here is X");
        x.show();
        Console.WriteLine();
        Console.WriteLine("Here is Y");
        y.show();
        Console.WriteLine();
        z = x + y;
        Console.WriteLine("Result of Z");
        z.show();
        Console.WriteLine();
    }
}