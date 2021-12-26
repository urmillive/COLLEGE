#include <iostream>

class test
{
    int a;

public:
    void get();
    int squere(int a);
    void show();
};

void test::get()
{
    std::cout << "Enter Value = ";
    std::cin >> a;
}

int test::squere(int a)
{
    return a * a;
}

void test::show()
{
    int s = squere(a);
    std::cout << "Squere = " << s;
}

int main()
{
    int a;
    test t1;
    t1.get();
    t1.squere(a);
    t1.show();
}
