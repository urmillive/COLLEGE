using System;

class fun
{
    int id;
    string name;
    public fun(int i, string n)
    {
        id = i;
        name = n;
    }
    public void disp()
    {
        Console.WriteLine("Id = " + id + "\nName = " + name);
    }

}

class main
{
    public static void Main()
    {
        fun f = new fun(20, "Jeet");
        f.disp();
    }
}