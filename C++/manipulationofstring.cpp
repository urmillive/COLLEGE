#include <iostream>
#include <string.h>

class line
{
    char *s;
    int length;

public:
    line()
    {
        length = 0;
        s = 0;
    }
    line(char *a)
    {
        length = strlen(a);
        s = new char[length + 1];
        strcpy(s, a);
    }
    void display()
    {
        std::cout << "String = " << s << "\n";
    }
    friend void operator==(line l1, line l2);
    friend void operator+(line l1, line l2);
};

void operator==(line l1, line l2)
{
    if (strcmp(l1.s, l2.s) == 0)
    {
        std::cout << "Same String\n";
    }
    else
    {
        std::cout << "Not Same";
    }
}

line operator+(line l1, line l2)
{
    line l3;
    l3.s = new char[l1.length + l2.length + 1];
    strcpy(l3.s, l1.s);
    strcat(l3.s, l2.s);
    return l3;
}

int main()
{
    line l1("Jeet");
    line l2("Patel");
    line l3("Hello");
    std::cout << "\nComparing l1,l2\n";
    l1 == l2;
    std::cout << "Comparing l1,l3\n";
    l1 == l3;
    line l4;
    l4 = l1 + l2;
    l4.display();
}