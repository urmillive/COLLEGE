#include <iostream>

class num
{
    float a, b;

public:
    void get(int x, int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        std::cout << "A = " << a << "\n";
        std::cout << "B = " << b << "\n";
    }
    friend num operator*(num n1, num n2);
};

num operator*(num n1, num n2)
{
    num n;
    n.a = n1.a * n2.a;
    n.b = n1.b * n2.b;
    return n;
}

int main()
{
    num n1;
    n1.get(5, 7);
    n1.display();
    num n2;
    n2.get(2, 3);
    n2.display();
    num n3 = n1 * n2;
    std::cout << "After Multiplying n1 and n2\n";
    n3.display();
}