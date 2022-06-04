using System;

class Program
{

    public static void Main()
    {
        Console.Write("Enter a number: ");
        int n = Int32.Parse(Console.ReadLine());

        Console.WriteLine();
        for (int i = n; i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                Console.Write("#");
            }
            Console.WriteLine();
        }

        Console.WriteLine();
    }
}