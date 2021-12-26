#include <iostream>
#include <conio.h>

class demo
{
    int a, b;

private:
    /* data */
public:
    void get_data()
    {
        std::cout << "Enter A : ";
        std::cin >> a;
        std::cout << "\nEnter B : ";
        std::cin >> b;
    }
    void add()
    {
        int sum;
        sum = a + b;
        std::cout << "\nSum is = " << sum;
    }
};

int main()
{
    std::cout << "Program of Addition \n";
    demo d1;
    d1.get_data();
    d1.add();
}