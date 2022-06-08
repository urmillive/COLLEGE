#include <iostream>
#include <conio.h>

double area(double r);
double area(double b, double h);

int main()
{
    double r, b, h;
    std::cout << "Enter Radius : ";
    std::cin >> r;
    std::cout << "Area of Circle = " << area(r);
    std::cout << "\nEnter B & H : ";
    std::cin >> b >> h;
    std::cout << "\nArea of Triangle = " << area(b, h);
}

double area(double r)
{
    double a = 3.14 * r * r;
    return a;
}

double area(double b, double h)
{
    double a = 0.5 * b * h;
    return a;
}