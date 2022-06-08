#include <iostream>

class time
{
    int h, m;

public:
    void set_time(int hrs, int mnt)
    {
        h = hrs;
        m = mnt;
    }
    void dispaly()
    {
        std::cout << "Hours : " << h << "\n";
        std::cout << "Minute : " << m << "\n";
    }
    friend time add(time t1, time t2);
};

time add(time t1, time t2)
{
    time t;
    t.m = t1.m + t2.m;
    t.h = t.m / 60;
    t.m = t.m % 60;
    t.h = t.h + t1.h + t2.h;
    return t;
}

int main()
{
    time t1, t2, t3;
    t1.set_time(1, 30);
    t2.set_time(2, 40);
    t2 = add(t1, t2);
    t1.dispaly();
    t2.dispaly();
    t3.dispaly();
}
