using System;

class tometo
{
    public static void Main()
    {
        for (int i = 0; i <= 5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                Console.WriteLine("{0}-{1}", i, j);
            }
        }
    }
}