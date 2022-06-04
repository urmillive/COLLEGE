using System;

class test
{
    public string country
    {
        set
        {
            _country = value;
        }
        get
        {
            return _country;
        }
    }
    public string state
    {
        set
        {
            _state = value;
        }
        get
        {
            return _state;
        }
    }
    private string _country;
    private string _state;
}

class main
{
    public static void Main()
    {
        test obj = new test();
        obj.country = "USA";
        obj.state = "New York";
        Console.WriteLine(obj.country);
        Console.WriteLine(obj.state);
    }
}