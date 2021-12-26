#include <iostream>

class stud
{
    int id;
    char name[20];
    int marks[3];
    float per;

public:
    void get_data();
    void calculate();
    void display();
};

void stud::get_data()
{
    std::cout << "Enter Roll No : ";
    std::cin >> id;
    std::cout << "\nEnter Name : ";
    std::cin >> name;
    std::cout << "\nEnter Marks of 3 Sub : \n";
    for (int i = 0; i < 3; i++)
    {
        std::cin >> marks[i];
    }
}

void stud::calculate()
{
    int total = 0;
    for (int i = 0; i < 3; i++)
    {
        total = total + marks[i];
    }
    per = total / 3;
}

void stud::display()
{
    std::cout << "------Student Information------\n";
    std::cout << "Roll No : " << id;
    std::cout << "\nName : " << name;
    std::cout << "\nPercentage : " << per;
}

int main()
{
    stud s1;
    s1.get_data();
    s1.calculate();
    s1.display();
}