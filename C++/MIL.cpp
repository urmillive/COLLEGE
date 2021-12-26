#include <iostream>

class test
{
    int a, b;

public:
    test(int x, int y) : a(x), b(y)
    {
        std::cout << "This is MIL\n";
    }
    void display()
    {
        std::cout << "A  = " << a << "\n";
        std::cout << "B = " << b;
    }
};

int main()
{
    test t(11, 22);
    t.display();
}