using System;

class table
{
    public static void Main()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = i; j <= 100; j += 10)
            {
                Console.Write("{0,-5}", j);
            }
            Console.WriteLine();
        }
    }
}