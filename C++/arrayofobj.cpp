#include <iostream>

class data
{
    int id;
    char name[20];
    float price;

public:
    void input()
    {
        std::cout << "Enter Book Id : ";
        std::cin >> id;
        std::cout << "\nEnter Book Name : ";
        std::cin >> name;
        std::cout << "\nEnter Price of Book : ";
        std::cin >> price;
    }

    void show()
    {
        std::cout << "Book Id : " << id;
        std::cout << "\nBook Name : " << name;
        std::cout << "\nBook Price : " << price;
    }
};

int main()
{
    data d[3];
    std::cout << "------Enter Book Data------\n";
    for (int i = 0; i < 3; i++)
    {
        d[i].input();
        std::cout << "------------\n";
    }
    std::cout << "------Book Information------\n";
    for (int i = 0; i < 3; i++)
    {
        d[i].show();
        std::cout << "\n------------\n";
    }
}
