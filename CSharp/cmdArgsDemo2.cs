using System;

class disp
{
    public static void Main(String[] args)
    {
        int temp = 0;
        for (int i = 0; i < args.Length; i++)
        {
            Console.WriteLine("{0}", args[i]);
            temp = 1;
        }
        if (temp == 0)
        {
            Console.WriteLine("No Arguments Are Passed !!!");
        }
    }
}