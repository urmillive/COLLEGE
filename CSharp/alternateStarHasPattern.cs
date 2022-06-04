using System;
class Program
{

    public static void Main(string[] args)
    {
        int i, j, n;
        string p, q;
        Console.Write("Input number of rows : ");
        n = Convert.ToInt32(Console.ReadLine());
        for (i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            { p = "#"; q = "*"; }
            else
            { p = "#"; q = "*"; }
            for (j = 1; j <= i; j++)
                if (j % 2 == 0)
                    Console.Write("{0}", p);
                else
                    Console.Write("{0}", q);
            Console.Write("\n");

        }
    }
}
