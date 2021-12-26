#include <iostream>

class base
{
public:
    void msg()
    {
        std::cout << "\nHello Guys I am Base.";
    }
};

class derived1 : public base
{
public:
    derived1()
    {
        std::cout << "\nThis is Derived1 Body.";
    }
};

class derived2 : public base
{
public:
    derived2()
    {
        std::cout << "\nThis is Derived2 Body.";
    }
};

int main()
{
    derived1 d1;
    derived2 d2;
    d1.msg();
    d2.msg();
}
