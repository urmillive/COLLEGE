using System;

class find
{
    public static void Main()
    {
        int firstNum, secondNum, thirdNum;
        Console.Write("Enter First Number : ");
        firstNum = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Second Number : ");
        secondNum = Int32.Parse(Console.ReadLine());
        Console.Write("Enter Third Number : ");
        thirdNum = Int32.Parse(Console.ReadLine());

        if (firstNum == secondNum)
        {
            if (secondNum == thirdNum)
            {
                Console.WriteLine("All The Numbers Are Same.");
            }
        }
        else if (thirdNum > firstNum)
        {
            if (thirdNum > secondNum)
            {
                Console.WriteLine("ThirdNum is Bigger.");
            }
            else
            {
                Console.WriteLine("SecondNum is Bigger.");
            }
        }
        else
        {
            if (firstNum > secondNum)
            {
                Console.WriteLine("FirstNum is Bigger.");
            }
            else
            {
                Console.WriteLine("SecondNum is Bigger");
            }
        }
    }
}