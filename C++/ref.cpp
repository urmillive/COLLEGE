#include <iostream>
#include <conio.h>

int &min(int &, int &);

int main()
{
    int a, b;
    std::cout <<"Enter a";
    std::cin >> a;
    std::cout <<"Enter b";
    std::cin >> b;
    min(a, b) = 0;
    std::cout <<"A =" ;
    std::cout <<"B =";
}
int &min(int &x, int &y)
{
    if (x < y)
        return x;
    else
        return y;
}
