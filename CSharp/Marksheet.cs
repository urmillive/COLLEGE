using System;

class stud
{
    public static void Main()
    {
        int rno;
        string name;
        int[] marks = new int[4];
        string[] sub = { "JAVA", "C#", "OS", "Network" };

        Console.Write("Enter Roll No : ");
        rno = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Name : ");
        name = Console.ReadLine();
        for (int i = 0; i < marks.Length; i++)
        {
            Console.Write("Enter Marks for {0} = ", sub[i]);
            marks[i] = Int32.Parse(Console.ReadLine());
        }

        Console.WriteLine("_______________________________________________________________");
        Console.WriteLine("Roll No : {0}", rno);
        Console.WriteLine("Student Name : {0}", name);
        Console.WriteLine("_______________________________________________________________");
        Console.WriteLine("No Subject Name       Marks(/100)");
        Console.WriteLine("_______________________________________________________________");
        for (int i = 0; i < sub.Length; i++)
        {
            Console.Write("{0, -5}", i + 1);
            Console.Write("{0, -19} {1}", sub[i], marks[i]);
            Console.WriteLine();
        }
        Console.WriteLine("_______________________________________________________________");

        // for (int i = 0; i < 5; i++)
        // {
        //     int total;
        //     total += marks[i];
        // }
        // Console.WriteLine("Total = {0}", total);
        Console.WriteLine("_______________________________________________________________");


    }

}