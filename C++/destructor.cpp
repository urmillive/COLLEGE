#include <iostream>

class test
{
public:
    test()
    {
        std::cout << "Object Created\n";
    }
    ~test()
    {
        std::cout << "Object Deleted\n";
    }
};

int main()
{
    test t1, t2;
    {
        std::cout << "Creating Object in a Block\n";
        test t3;
        std::cout << "Object will be destroyed when block Ends\n";
        std::cout << "Press any key to Exit\n";
    }
}
