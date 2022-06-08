#include <iostream>

class infun
{
    int a;
public:
    void input(int n);
    void disp();
};

void infun::input(int n) { a = n; }
void infun::disp() { std::cout << "Value = " << a; }

int main()
{
    infun i1;
    i1.input(10);
    i1.disp();
}
