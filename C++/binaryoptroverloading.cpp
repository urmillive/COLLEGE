#include <iostream>

class num
{
    float a, b;

public:
    void input(int x, int y)
    {
        a = x;
        b = y;
    }
    void show()
    {
        std::cout << "A = " << a << "\n";
        std::cout << "B = " << b << "\n";
    }
    num operator+(num n1);
};

num num::operator+(num n1)
{
    num n;
    n.a = a + n1.a;
    n.b = b + n1.b;
    return n;
}

int main()
{
    num n1;
    n1.input(10, 20);
    n1.show();
    num n2;
    n2.input(100, 200);
    n2.show();
    num n3 = n1 + n2;
    std::cout << "After Adding n1 and n2\n";
    n3.show();
}