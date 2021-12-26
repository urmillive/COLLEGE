#include <iostream>

class demo
{
    int a, b;

public:
    void set_value(int x,int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        std::cout << a << " " << b;
    }
    friend void sum(demo f);
};

void sum(demo f)
{
    int s = f.a + f.b;
    std::cout << "\nSum = " << s;
}

int main()
{
    demo f;
    f.set_value(10, 20);
    f.display();
    sum(f);
}
