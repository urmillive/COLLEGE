using System;
using System.Collections;

class hashtblDemo
{
    public static void Main()
    {
        Hashtable ht = new Hashtable();
        ht["F"] = 20;
        ht["G"] = 30;
        ht["H"] = 40;
        ht["I"] = 50;
        ht["J"] = 60;
        Console.WriteLine("Number Of Elements = {0}", ht.Count);
        Console.WriteLine("___________Keys___________");
        foreach (string k in ht.Keys)
        {
            Console.WriteLine(" |{0}|", k);
        }
        Console.WriteLine("__________Values__________");
        foreach (int v in ht.Values)
        {
            Console.WriteLine(" |{0}|", v);
        }
        ht.Remove("G");
        Console.WriteLine("__________________________");
        Console.WriteLine("After Removing Element");
        Console.WriteLine("Number Of Element = {0}", ht.Count);
        Console.WriteLine("Use DictionaryEntry Class");
        Console.WriteLine("__________________________");
        foreach (DictionaryEntry d in ht)
        {
            Console.WriteLine("| {0,-2} {1} |", d.Key, d.Value);
        }
    }
}