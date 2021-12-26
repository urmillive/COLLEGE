#include <iostream>

inline int sq(int &a) { return a * a; }

int main()
{
    int x;
    std::cout << "Enter Value = ";
    std::cin >> x;
    std::cout << "Squere of Value = ";
    std::cout << sq(x);
}