#include <iostream>

class test
{
public:
    void demo();
};

void test::demo()
{
    class hello
    {
        public:
        void show()
        {
            std::cout << "This is Show.";
        }
    };
    std::cout << "Calling Function\n";
    hello h;
    h.show();
}

int main()
{
    test t;
    t.demo();
}