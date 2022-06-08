#include<iostream>

class test
{
    int a, b;
    public:
        test()
        {
            a = 0;
            b = 0;
        }
        void show()
        {
            std::cout << "A = " << a << "\n";
            std::cout << "B = " << b;
        }
};

int main()
{
    test t;
    t.show();
}