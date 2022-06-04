using System;

class stud
{
    static string name;
    static int rno;
    static string[] sub = new string[6] {
            "Chemistry", "Physics", "Mathes",
            "GK", "English", "Computer"
        };
    static int[] marks = new int[6];
    static int totalMarks = 600;
    static int obtainMarks = 0;
    static float per;

    public static void Main()
    {
        get_data();
        cal_data();
        display();
    }

    public static void get_data()
    {
        Console.Write("Enter Roll No : ");
        rno = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Name : ");
        name = Console.ReadLine();
        for (int i = 0; i < marks.Length; i++)
        {
            Console.Write("Enter Marks of {0} = ", sub[i]);
            marks[i] = Int32.Parse(Console.ReadLine());
        }
        Console.WriteLine();
    }

    public static void cal_data()
    {
        for (int i = 0; i < marks.Length; i++)
        {
            obtainMarks = obtainMarks + marks[i];
        }
        per = (obtainMarks / totalMarks) * 100;
    }

    public static void display()
    {
        Console.WriteLine("******************************************************");
        Console.WriteLine("*                   Final Marksheet                  *");
        Console.WriteLine("******************************************************");
        Console.WriteLine("*  Roll No : {0,-5}                                  *", rno);
        Console.WriteLine("*  Name : {0,-5}                                     *", name);
        Console.WriteLine("******************************************************");
        for (int i = 0; i < sub.Length; i++)
        {
            Console.Write("{0,-2}", i + 1);
            Console.Write("{0,-19} {1}", sub[i], marks[i]);
            Console.WriteLine();
        }
        Console.WriteLine("******************************************************");
        Console.WriteLine("*  Obtained Marks : {0}                              *", obtainMarks);
        Console.WriteLine("*  Percentage : {0}                                  *", per);
        if (per >= 85)
        {
            Console.WriteLine("*  Remarks : Excellent                           *");
        }
        else if (per < 75)
        {
            Console.WriteLine("*  Remarks : Very Good                           *");
        }
        else if (per < 65)
        {
            Console.WriteLine("*  Remarks : Good                                *");
        }
        else if (per < 45)
        {
            Console.WriteLine("*  Remarks : Need Improvement                    *");
        }
        else if (per > 33)
        {
            Console.WriteLine("*  Remarks : Fail, Better Luck Next Time         *");
        }
        Console.WriteLine("******************************************************");
    }
}