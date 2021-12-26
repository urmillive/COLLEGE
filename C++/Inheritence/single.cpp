#include <iostream>

class base
{
    int a;

public:
    void input(int x)
    {
        a = x;
    }
    void show()
    {
        std::cout << "Value = " << a;
    }
};

class derived : public base
{
public:
    derived()
    {
        std::cout << "\nHello I am Base\n";
    }
};

int main()
{
    derived d;
    d.input(404);
    d.show();
}