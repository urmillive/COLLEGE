#include <iostream>

class demo
{
    float h, w, d;

public:
    demo()
    {
        h = w = d = 0;
    }
    demo(float h1, float w1, float d1)
    {
        h = h1;
        w = w1;
        d = d1;
    }
    demo(demo &b)
    {
        h = b.h;
        w = b.w;
        d = b.d;
    }
    void display()
    {
        std::cout << "Height = " << h << "\n";
        std::cout << "Width = " << h << "\n";
        std::cout << "Depth = " << h << "\n";
        std::cout << "Volume = " << h * w * d << "\n";
    }
};

int main()
{
    demo d1;
    demo d2(10, 20, 30);
    demo d3(d2);
    std::cout << "Box 1\n";
    d1.display();
    std::cout << "------------------";
    std::cout << "\nBox 2\n";
    d2.display();
    std::cout << "------------------";
    std::cout << "\nBox 2\n";
    d3.display();
}