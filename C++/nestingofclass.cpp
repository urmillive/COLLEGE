#include <iostream>

class outer
{
public:
    class inner
    {
    public:
        void show_inner()
        {
            std::cout << "Inner\n";
        }
    };
    void show_outer()
    {
        std::cout << "Outer\n";
        inner i;
        i.show_inner();
    }
};

int main()
{
    outer o1;
    o1.show_outer();
}