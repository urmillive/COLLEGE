using System;

class twoD
{
    public double width, height;
    public void show_dim()
    {
        Console.WriteLine("Width = {0} Height = {1}", width, height);
    }
}

class threeD : twoD
{
    public string style;
    public double Area()
    {
        return (width * height) / 2;
    }
    public void showStyle()
    {
        Console.WriteLine("Trai Style is {0}", style);
    }
}

class shape
{
    public static void Main()
    {
        threeD t1 = new threeD();
        threeD t2 = new threeD();
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "Left";
        t2.width = 8.0;
        t2.height = 8.0;
        t2.style = "Right";

        Console.WriteLine("Info for T1");
        t1.showStyle();
        t1.show_dim();
        Console.WriteLine("Area is : " + t1.Area());
        Console.WriteLine("Info for T2");
        t2.showStyle();
        t2.show_dim();
        Console.WriteLine("Area is : " + t2.Area());
    }
}