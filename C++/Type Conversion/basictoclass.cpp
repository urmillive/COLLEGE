#include <iostream>

class time
{
    int hours, minutes;

public:
    time()
    {
        hours = minutes = 0;
    }
    time(int t)
    {
        hours = t / 60;
        minutes = t % 60;
    }
    void display()
    {
        std::cout << "Hours =" << hours << " ";
        std::cout << "Minutes =" << minutes;
    }
};

int main()
{
    int t;
    std::cout << "Enter time in minutes : ";
    std::cin >> t;
    time t1 = t; // time t1(t);
    t1.display();
}
