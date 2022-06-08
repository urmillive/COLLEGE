#include <iostream>
#include <conio.h>

class a
{
public:
    int x, y;
    void getdata()
    {
        std::cout << "\nEnter value of x :\n";
        std::cin >> x;
        std::cout << "\nEnter value of y :\n";
        std::cin >> y;
    }
};
class b : public a
{
public:
    void sum()
    {
        std::cout << "\nSum= " << x + y;
    }
};
class c : public a
{
public:
    void sub()
    {
        std::cout << "\nSubstraction=" << x - y;
    }
};
class d : public a
{
public:
    void multi()
    {
        std::cout << "\nMultiplication= " << x * y;
    }
};
class e : public a
{
public:
    void divi()
    {
        std::cout << "\nDivision=" << x / y;
    }
};

int main()
{

    b obj1;
    c obj2;
    d obj3;
    e obj4;
    obj1.getdata();
    obj1.sum();
    obj2.getdata();
    obj2.sub();
    obj3.getdata();
    obj3.multi();
    obj4.getdata();
    obj4.divi();
    return 0;
}