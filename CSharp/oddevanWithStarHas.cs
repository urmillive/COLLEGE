using System;

class test
{
    public static void Main()
    {
        Console.Write("Enter a number: ");
        int n = Int32.Parse(Console.ReadLine());

        Console.WriteLine();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j % 2 == 0)
                {
                    Console.Write("# ");
                }
                else
                {
                    Console.Write("* ");
                }
            }
            Console.WriteLine();
        }
    }
}