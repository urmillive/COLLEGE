//call by value demo
#include<stdio.h>
#include<conio.h>
void addition(int num1,int num2)
{
	printf("\nThe Addition is = %d",num1+num2);

}
void substraction(int num1,int num2)
{
	printf("\nThe Subtraction is = %d",num1-num2);

}
void multiplication(int num1,int num2)
{
	printf("\nThe Multiplication is = %d",num1*num2);

}
void division(int num1,int num2)
{
	printf("\nThe Division is = %d",num1/num2);

}
void main()
{

	int num1;
	int num2;
	//clrscr();
	printf("\nFirst number = ");
	scanf("%d",&num1);

	printf("\nSecond number = ");
	scanf("%d",&num2);

	printf("\nThe All Results are below");
	printf("\n*************************");
	addition(num1,num2);
	substraction(num1,num2);
	multiplication(num1,num2);
	division(num1,num2);
	getch();
}
