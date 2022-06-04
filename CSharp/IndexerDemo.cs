using System;

class myExp
{
    private string[] myCompnies = new string[10];
    public string this[int index]
    {
        get
        {
            if (myCompnies[index] == null)
            {
                return "NULL";
            }
            else
            {
                return myCompnies[index];
            }
        }
        set
        {
            if (index > 0 || index <= 10)
            {
                myCompnies[index] = value;
            }
        }
    }
}

class main
{
    public static void Main()
    {
        myExp obj = new myExp();
        obj[0] = "Intel";
        obj[3] = "MicroSoft";
        obj[6] = "Dell";
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine(obj[i]);
        }
    }
}