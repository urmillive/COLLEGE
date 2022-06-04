using System;
using System.Collections;

class StudDemo
{
    public static void Main()
    {
        string name;
        int total;
        SortedList s = new SortedList();
        Console.WriteLine("____________________________________________");
        for (int i = 0; i < 5; i++)
        {
            Console.Write("| Enter Student Name : ");
            name = Console.ReadLine();
            Console.Write(" |");
            Console.Write("| Enter Student Total Marks : ");
            total = Int32.Parse(Console.ReadLine());
            Console.Write(" |");
            s.Add(name, total);
            Console.WriteLine("| _______________________________ |");
        }
        Console.WriteLine("____________________________________________");
        foreach (DictionaryEntry d in s)
        {
            // marks = s.Values;
            // per = (marks / 600) * 100;
            Console.WriteLine(" {0,-10} | {1} ", d.Key, d.Value);
        }
        Console.WriteLine("____________________________________________");
    }
}