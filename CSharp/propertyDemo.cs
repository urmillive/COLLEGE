using System;

class employee
{
    public string FirstName
    {
        set
        {
            _FirstName = value;
        }
        get
        {
            return _FirstName;
        }
    }
    private string _FirstName;
}

class main
{
    public static void Main()
    {
        employee emp = new employee();
        emp.FirstName = "India";
        Console.WriteLine(emp.FirstName);
    }
}