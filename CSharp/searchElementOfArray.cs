using System;

class find
{
    public static void Main()
    {
        int get;
        int position = 0;
        int temp = 0;
        int[] data = new int[10];
        Console.WriteLine("Enter Data Inside The Array");
        Console.WriteLine("________________________________");
        for (int i = 0; i < data.Length; i++)
        {
            Console.Write("Data[" + i + "] = ");
            data[i] = Int32.Parse(Console.ReadLine());
        }
        Console.Write("Which Value Do You Search :  ");
        get = Int32.Parse(Console.ReadLine());
        for (int i = 0; i < data.Length; i++)
        {
            if (data[i] == get)
            {
                temp = 1;
                break;
            }
            position = i;
        }
        if (temp == 1)
        {
            Console.WriteLine("{0} is found at position {1}", get, position + 1);
        }
        else
        {
            Console.WriteLine("{0} is not found in the array", get);
        }
    }
}