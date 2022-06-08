#include <iostream>

int x = 100;



class demo{
	int x = 20;
	public:
		void disp(){
			std::cout<<x<<"\n";
			std::cout<<::x<<"\n";
		}
};

int main() {
	int x = 10;
	demo d1;
	d1.disp();
	std::cout<<x;
}
