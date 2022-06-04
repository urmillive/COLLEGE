using System;

class B
{
    protected int i, j;
    public void set_ab(int a, int b)
    {
        i = a;
        j = b;
    }
    public void show()
    {
        Console.WriteLine("I = {0} J = {1}", i, j);
    }
}
class D : B
{
    int k;
    public void set_k()
    {
        k = i * j;
    }
    public void show_k()
    {
        Console.WriteLine("K = {0}", k);
    }
}

class Prot_demo
{
    public static void Main()
    {
        D obj = new D();
        obj.set_ab(2, 3);
        obj.show();
        obj.set_k();
        obj.show_k();
    }
}