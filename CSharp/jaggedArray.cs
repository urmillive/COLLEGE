using System;

class demo
{
    public static void Main()
    {
        int[][] jagged = new int[3][];
        jagged[0] = new int[2] { 1, 2 };
        jagged[1] = new int[5] { 10, 20, 30, 40, 50 };
        jagged[2] = new int[4] { 4, 5, 6, 7 };

        for (int i = 0; i < jagged.Length; i++)
        {
            for (int j = 0; j < jagged[i].Length; j++)
            {
                Console.WriteLine("Row = {0} , Col = {1} : Value = {2}", i, j, jagged[i][j]);
            }
        }
    }
}