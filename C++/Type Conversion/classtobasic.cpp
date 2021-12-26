#include <iostream>

class product
{
    int qty;
    float price;

public:
    product(int q, float p)
    {
        qty = q;
        price = p;
    }
    void display()
    {
        std::cout << "Quantity is : " << qty;
        std::cout << "  ";
        std::cout << "Price is : " << price;
    }
    operator float()
    {
        return qty * price;
    }
};

int main()
{
    product p(10, 25);
    p.display();
    float amount;
    amount = p;
    std::cout << "\nTotal Amount =" << amount;
}
