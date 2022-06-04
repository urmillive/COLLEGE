using System;

public class Test
{
    public static void Main()
    {
        int n, i, t = 0;
        Console.Write("Enter a number:");
        n = Int32.Parse(Console.ReadLine());

        Console.WriteLine("Table is:");
        for (i = 1; i <= 10; i++)
        {
            t = n * i;
            Console.WriteLine("{0} X {1} = {2}", n, i, t);
        }

    }
}