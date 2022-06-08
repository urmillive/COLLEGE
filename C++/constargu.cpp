#include <iostream>
#include <conio.h>

int test(const int a, int b);

int main()
{
    std::cout << "Sum = " << test(10, 20);
}

int test(const int a, int b)
{

    int c = a + b;
    return c;
}