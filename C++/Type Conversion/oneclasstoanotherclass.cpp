#include <iostream>

class shop1
{
    int code, qty;
    float price;

public:
    shop1(int c, int q, float p)
    {
        code = c;
        qty = q;
        price = p;
    }
    int getcode()
    {
        return code;
    }
    int getqty()
    {
        return qty;
    }
    float getprice()
    {
        return price;
    }

    void display()
    {
        std::cout << "\nShop1 Details\n";
        std::cout << "Item Code : " << code;
        std::cout << "\n";
        std::cout << "Quantity : " << qty;
        std::cout << "\n";
        std::cout << "Price : " << price;
        std::cout << "\n";
    }
};
class shop2
{
    int code;
    float amount;

public:
    shop2(int c, float a)
    {
        code = c;
        amount = a;
    }
    void display()
    {
        std::cout << "\nShop2 Details\n";
        std::cout << "Item Code : " << code;
        std::cout << "\n";
        std::cout << "Total Amount : " << amount;
    }
    shop2(shop1 s1)
    {
        code = s1.getcode();
        amount = s1.getqty() * s1.getprice();
    }
};

int main()
{
    shop1 s1(111, 5, 24.5);
    shop2 s2 = s1; // shop2 s2(s1);
    s1.display();
    s2.display();
}
