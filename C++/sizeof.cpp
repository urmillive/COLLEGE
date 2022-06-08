#include<iostream>

class test
{
    int a, b;
    char name[100];
    float per;
};

int main()
{
    test t1;
    std::cout << "Size = " << sizeof(t1);
}