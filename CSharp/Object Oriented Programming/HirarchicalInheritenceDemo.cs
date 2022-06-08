using System;

class dataBase
{
    public dataBase()
    {
        commonField = 42;
    }
    public int commonField;
    public void commonMethod()
    {
        Console.WriteLine("DataBase Method Called.");
    }
}
class SQLServer : dataBase
{
    public void sqlServerMethod()
    {
        Console.WriteLine("SQLServer Method Called.");
    }
}
class oracle : dataBase
{
    public void oracleMethod()
    {
        Console.WriteLine("Oracle Method Called.");
    }
}

class main
{
    public static void Main()
    {
        Console.WriteLine("Calling SQLServer");
        SQLServer s = new SQLServer();
        Console.WriteLine("Calling SQLServer Method");
        s.sqlServerMethod();
        Console.WriteLine("Calling Common Field");
        s.commonMethod();
        Console.WriteLine("Proccessing Common Field " + s.commonField);
        Console.WriteLine("Calling Oracle");
        oracle o = new oracle();
        Console.WriteLine("Calling Oracle Method");
        o.oracleMethod();
        Console.WriteLine("Accessing Common Field " + o.commonField);
    }
}