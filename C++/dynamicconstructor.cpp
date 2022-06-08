#include <iostream>
#include <string.h>

class text
{
    char *name;
    int len;

public:
    text()
    {
        len = 0;
        name = new char[1];
    }
    text(char *n)
    {
        len = strlen(n);
        name = new char[len + 1];
        strcpy(name, n);
    }
    void show()
    {
        std::cout << "Name is : " << name << "\n";
    }
};

int main()
{
    char *name = "Jeet404";
    text t1;
    t1 = text(name);
    t1.show();
    text t2("Hello");
    t2.show();
}