#include <iostream>

class num
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
        std::cout << "A  = " << a << " ";
        std::cout << "B  = " << b;
    }
    void operator-();
};

void num::operator-()
{
    a = -a;
    b = -b;
}

int main()
{
    num n1;
    n1.input(10, -20);
    n1.show();
    std::cout << "\nAfter Overloading\n";
    -n1;
    n1.show();
}