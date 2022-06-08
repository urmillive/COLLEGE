using System;

class arrDemo
{
    public static void Main()
    {
        int[][] arr = new int[3][];
        arr[0] = new int[2] { 100, 200 };
        arr[1] = new int[5] { 10, 20, 30, 40, 50 };
        arr[2] = new int[3] { 1, 2, 3 };

        for (int i = 0; i < arr.Length; i++)
        {
            Console.WriteLine("Row = {0} ", i);
            for (int j = 0; j < arr[i].Length; j++)
            {
                Console.Write("|" + arr[i][j] + "|");
            }
            Console.WriteLine();
        }
    }
}