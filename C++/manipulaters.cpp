#include <iostream>
#include <iomanip>

int main(int argc, char **argv)
{
	int a = 123;
	int b = 12345;
	int c = 1234;
	std::cout << "A = " << std::setw(5) << a << std::endl;
	std::cout << "B = " << std::setw(5) << b << std::endl;
	std::cout << "C = " << std::setw(5) << c << std::endl;
}
