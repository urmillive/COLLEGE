using System;

class A
{
    public A()
    {
        Console.WriteLine("| Constructing A |");
    }
}
class B : A
{
    public B()
    {
        Console.WriteLine("| Constructing B |");
    }
}
class C : B
{
    public C()
    {
        Console.WriteLine("| Constructing C |");
    }
}

class main
{
    public static void Main()
    {
        C obj = new C();
    }
}