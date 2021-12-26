#include <iostream>
#include <conio.h>

void swap(int &a, int &b);
int main()
{
    int x = 10;
    int y = 20;
    std::cout << "Before Swap";
    std::cout << "\n"
              << x << " " << y
              << "\n";
    swap(x, y);
    std::cout << "After Swap";
    std::cout << "\n"
              << x << " " << y;
}

void swap(int &a,int &b){
    int t = a;
    a = b;
    b = t;
}