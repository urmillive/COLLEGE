#include <iostream>

class demo
{
    int a;
    static int b;

public:
    void get_value(int x)
    {
        a = x;
        b++;
        std::cout << a;
    }
    void get_static()
    {
        std::cout << b;
    }
};

int demo::b;

int main()
{
    demo d1,d2;
    std::cout << "\nStatic Value for d1 : ";
    d1.get_static();
    std::cout << "\nStatic Value for d2 : ";
    d2.get_static();
    std::cout << "\nValue for d1 : ";
    d1.get_value(111);
    std::cout << "\nValue for d2 : ";
    d2.get_value(333);
    std::cout << "\nStatic Value for d1 : ";
    d1.get_static();
    std::cout << "\nStatic Value for d2 : ";
    d2.get_static();
}