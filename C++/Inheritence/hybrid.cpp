#include <iostream>

class A
{
public:
    int x;
};

class B : public A
{
public:
    B()
    {
        x = 10;
    }
};

class C
{
public:
    int y;
    C()
    {
        y = 4;
    }
};
class D : public B, public C
{
public:
    void sum()
    {
        std::cout << "sum = " << x + y;
    }
};

int main()
{
    D obj;
    obj.sum();
}
