/*
    Step - 1 : First of all Compile the program using... csc <programName>.cs
    Step - 2 : If your code successfully Compiled the Execute / Run the program using... <programName>/<programName>.exe ... (Don't Press Enter)
    Step - 3 : When you Wrote above step's command then put space on same line and write like this... <Num1> <Sign> <Num2> ... Than Press Enter and you can see the result.
*/


using System;

class calc
{
    public static void Main(String[] args)
    {
        int num1, num2, res;
        num1 = int.Parse(args[0]);
        num2 = int.Parse(args[2]);

        if (args[1] == "+")
        {
            res = num1 + num2;
            Console.WriteLine("{0} {1} {2} = {3}", num1, args[1], num2, res);
        }
        else if (args[1] == "-")
        {
            res = num1 - num2;
            Console.WriteLine("{0} {1} {2} = {3}", num1, args[1], num2, res);
        }
        else if (args[1] == "*")
        {
            res = num1 * num2;
            Console.WriteLine("{0} {1} {2} = {3}", num1, args[1], num2, res);
        }
        else if (args[1] == "/")
        {
            res = num1 / num2;
            Console.WriteLine("{0} {1} {2} = {3}", num1, args[1], num2, res);
        }
        else
        {
            Console.WriteLine("Enter Proper Values.");
        }
    }
}