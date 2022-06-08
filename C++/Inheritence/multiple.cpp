#include <iostream>

class base1
{
public:
    void disp()
    {
        std::cout << "Hello I am Base1 Class.\n";
    }
};

class base2
{
public:
    void show()
    {
        std::cout << "Hello I am Base2 Class.\n";
    }
};

class derived : public base1, public base2
{
public:
    derived()
    {
        std::cout << "Hello I am Derived Class.\n";
    }
};

int main()
{
    derived d;
    d.disp();
    d.show();
}