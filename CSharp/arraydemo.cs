using System;

class demo
{
    public static void Main()
    {
        int[,] age = new int[4, 3];
        Console.WriteLine("Enter Elements For Arrray : ");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                age[i, j] = Int32.Parse(Console.ReadLine());
            }
        }
        Console.WriteLine("____________________________________________");
        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 3; j++)
            {
                Console.Write(age[i, j]);
                Console.Write(" ");
            }
            Console.WriteLine();
        }
    }
}