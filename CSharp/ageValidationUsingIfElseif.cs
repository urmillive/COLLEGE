using System;

class test
{
    public static void Main()
    {
        int age;
        Console.WriteLine("Enter Your Age : ");
        age = Int32.Parse(Console.ReadLine());
        if (age < 18)
        {
            Console.WriteLine("You are not able to get driving license.");
        }
        else if (age > 18 && age < 60)
        {
            Console.WriteLine("You are able to get driving license.");
        }
        else if (age > 60)
        {
            Console.WriteLine("You are too old to get driving license.");
        }
        else if (age == 18)
        {
            Console.WriteLine("We Decide after Physical Test.");
        }
        else
        {
            Console.WriteLine("Enter Proper Value.");
        }

    }
}