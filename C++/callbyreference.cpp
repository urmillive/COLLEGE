#include <iostream>

void change(int &x, int &y);

int main()
{
    int a, b;

    std::cout << "Enter a : ";
    std::cin >> a;
    std::cout << std::endl;
    std::cout << "Enter b : ";
    std::cin >> b;
    std::cout << std::endl;
    std::cout << "Before swap" << std::endl;
    std::cout << a << std::endl
              << b << std::endl;
    change(a, b);
    std::cout << "after swap" << std::endl;
    std::cout << a << std::endl
              << b;
}
void change(int &x, int &y)
{
    x = x + 10;
    y = y + 10;
}
