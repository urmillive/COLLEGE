#include <iostream>

class demo
{
private:
    /* data */
public:
    void print();
};

void demo ::print()
{
    std::cout << "Hello World!";
}

int main()
{
    demo d1;
    d1.print();
}
