using System;

class week
{
    public static void Main()
    {
        int choice;
        Console.WriteLine("Enter Value For Day : ");
        choice = Int32.Parse(Console.ReadLine());
        if (choice == 1)
        {
            Console.WriteLine("Sunday");
        }
        else if (choice == 2)
        {
            Console.WriteLine("Monday");
        }
        else if (choice == 3)
        {
            Console.WriteLine("Tuesday");
        }
        else if (choice == 4)
        {
            Console.WriteLine("Wendusday");
        }
        else if (choice == 5)
        {
            Console.WriteLine("Thursday");
        }
        else if (choice == 6)
        {
            Console.WriteLine("Friday");
        }
        else if (choice == 7)
        {
            Console.WriteLine("Seturday");
        }
        else
        {
            Console.WriteLine("Enter Proper Day Number!!!");
        }
    }

}