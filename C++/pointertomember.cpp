#include <iostream>

class demo
{
    int a, b;

public:
    void set(int p, int q)
    {
        a = p;
        b = q;
    }
    void display()
    {
        std::cout<< "\n" << a << "\n"
                  << b;
    }
    friend void add(demo p);
    friend void sub(demo p);
};

void add(demo p)
{
    int demo::*p1 = &demo::a;
    int demo::*p2 = &demo::b;
    int s = p.*p1 + p.*p2;
    std::cout << "\nAddition = " << s;
}

void sub(demo p)
{
    int demo::*p1 = &demo::a;
    int demo::*p2 = &demo::b;
    demo *ptr = &p;
    int s = ptr->*p1 - ptr->*p2;
    std::cout << "\nSubtraction = " << s;
}

int main()
{
    demo p;
    p.set(50, 20);
    p.display();
    add(p);
    sub(p);
}