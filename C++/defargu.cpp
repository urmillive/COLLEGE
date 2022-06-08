#include <iostream>
#include <conio.h>

void addition(int a, int b, int c = 0, int d = 0);
void multiplication(int a, int b, int c = 1);

int main()
{
    addition(10, 20);
    addition(20, 30, 40);
    addition(1, 2, 3, 4);
    multiplication(5, 5);
    multiplication(5, 5, 4);
    multiplication(10, 45, 20);
}

void addition(int a, int b, int c, int d)
{
    int s = a + b + c + d;
    std::cout << "Sum = " << s << "\n";
}

void multiplication(int a, int b, int c)
{
    int m = a * b * c;
    std::cout << "Multiplication =" << m << "\n";
}