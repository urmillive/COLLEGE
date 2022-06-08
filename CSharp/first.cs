using System;

class bca
{
    public static void Main()
    {
        string s1 = "Hello";
        string s2 = "India";
        string s3 = "BCA";
        int num1;
        int num2;

        Console.WriteLine("S1 = {0} S2 = {1} S3 = {2}", s1, s2, s3);
        num1 = Int32.Parse(Console.ReadLine());
        num2 = Int32.Parse(Console.ReadLine());
        int sum = num1 + num2;
        Console.WriteLine("Sum = {0}", sum);
    }
}