#include <iostream>

class bigest
{
public:
    void hello()
    {
        std::cout << "Hello I am The Bigest\n";
    }
};

class bigger : public bigest
{
public:
    void world()
    {
        std::cout << "Hello I am The Bigger\n";
    }
};

class big : public bigger
{
public:
    void show()
    {
        std::cout << "Hello I am Big.";
    }
};

int main()
{
    big b;
    b.hello();
    b.world();
    b.show();
}