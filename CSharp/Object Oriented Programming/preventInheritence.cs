using System;

sealed class What
{
    public int a;
    public string b;
    public void disp()
    {
        a = 10;
        b = "HOWDY";
        Console.WriteLine(a + " " + b);
    }
}

// class Why : What
// {
//     //code;
// }

class main
{
    public static void Main()
    {
        What w = new What();
        w.disp();
    }
}