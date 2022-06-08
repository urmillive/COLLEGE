#include <iostream>
#include <conio.h>

class number
{
    int a, b;

public:
    void input(int x, int y)
    {
        a = x;
        b = y;
    }
    void show()
    {
        std::cout <<“a =“<< a;
        std::cout <<“b =“<< b;
    }
    void operator –();
};
void number ::operator –()
{
    a = -a;
    b = -b;
}
void main()
{
    number n1;
    n1.input(10, -20);
    n1.show();
    std::cout<<“After overloading”;
    -n1; // - function call
    n1.show();
    getch();
}
