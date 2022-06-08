using System;

class error
{
    public static void Main()
    {
        string s = null;
        try
        {
            Console.WriteLine("Before calling s.Tolower");
            s.ToLower();
            Console.WriteLine("After calling s.Tolower");
        }
        catch (NullReferenceException er)
        {
            Console.WriteLine("I am in Catch.");
            Console.WriteLine("Massage " + er.Message);
            Console.WriteLine("Error " + er.StackTrace);
        }
        finally
        {
            Console.WriteLine("I am in Finally.");
        }
    }
}