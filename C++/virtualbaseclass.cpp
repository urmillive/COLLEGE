    #include <iostream>

class book
{
protected:
    int b_id;
    char name[10];

public:
    void getbook()
    {
        std::cout << "Enter book id = ";
        std::cin >> b_id;
        std::cout << "\n";
        std::cout << "Enter book name = ";
        std::cin >> name;
        std::cout << "\n";
    }
    void showbook()
    {
        std::cout << "Book id = " << b_id;
        std::cout << "\n";
        std::cout << "Book name = " << name;
        std::cout << "\n";
    }
};

class bookprice : public virtual book
{
protected:
    double price;

public:
    void getprice()
    {
        std::cout << "Enter book price = ";
        std::cin >> price;
        std::cout << "\n";
    }
    void showprice()
    {
        std::cout << "Book price = " << price;
        std::cout << "\n";
    }
};
class discount : virtual public book
{
protected:
    double d;

public:
    void getdiscount()
    {
        std::cout << "Enter discount % = ";
        std::cin >> d;
        std::cout << "\n";
    }

    void showdiscount()
    {
        std::cout << "Discount = " << d << "%";
    }
};
class publisher : public bookprice, public discount
{
    double fp;
    char pub[20];

public:
    void getdetail()
    {
        getbook();
        getprice();
        getdiscount();
        std::cout << "Enter publisher name : ";
        std::cin >> pub;
        std::cout << "\n";
    }

    void showdetail()
    {
        showbook();
        showprice();
        showdiscount();
        fp = price - (price * d / 100);
        std::cout << "\nFinal price = " << fp;
        std::cout << "\n";
        std::cout << "Book publisher = " << pub;
    }
};

int main()
{
    publisher p;
    p.getdetail();
    p.showdetail();
}
