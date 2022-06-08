#include <iostream>

class demo
{
    int a, b;

public:
    demo(int x,int y)
    {
        a = x;
        b = y;
    }
    void show()
    {
        std::cout << a << " " << b << "\n";
    }
};

int main()
{
    demo t1 = demo(10, 20);
    t1.show();
    demo t2(20, 30);
    t2.show();
}