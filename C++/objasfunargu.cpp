#include <iostream>

class test
{
    int a, b;

public:
    void input(int x,int y)
    {
        a = x;
        b = y;
    }
    void sum(test t1,test t2)
    {
        a = t1.a + t2.a;
        b = t1.b + t2.b;
    }
    void output()
    {
        std::cout << a << " " << b << "\n";
    }
};

int main()
{
    test t1, t2, t3;
    t1.input(10, 20);
    t2.input(100, 200);
    t3.sum(t1, t2);
    t1.output();
    t2.output();
    t3.output();
}