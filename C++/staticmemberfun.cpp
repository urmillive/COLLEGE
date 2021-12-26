#include <iostream>

class test
{
    int a;
    static int count;

public:
    void show()
    {
        count++;
        a = count;
        std::cout << a;
    }
    static void showcount()
    {
        std::cout << count;
    }
};

int test::count;

int main()
{
    test t1, t2, t3;
    test::showcount();
    t1.show();
    t2.show();
    t3.show();
    test::showcount();
    test::showcount();
    test::showcount();
}