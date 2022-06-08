using System;
using System.Collections;

class arrLstDemo
{
    public static void Main()
    {
        ArrayList a = new ArrayList();
        a.Add("A");
        a.Add("B");
        a.Add("C");
        a.Add("D");
        a.Add("E");
        Console.WriteLine(" _ Number Of Elements = {0}", a.Count);
        foreach (string item in a)
        {
            Console.WriteLine("|" + item + "|");
        }
        a.Remove("C");
        Console.WriteLine(" _ After Removing Element");
        Console.WriteLine(" _ Number of Elements = {0}", a.Count);
        foreach (string item in a)
        {
            Console.WriteLine("|" + item + "|"); 
        }
        Console.WriteLine(" _ D is Available : {0} ", a.Contains("D"));
    }
}