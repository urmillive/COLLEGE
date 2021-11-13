/*Program: Area of Circle
*/
#include<stdio.h>
#include<conio.h>

#define PI 3.14

void area(int);

main()
{
	int radius;
	printf("Enter Radius of Circle: ");
	scanf("%d",&radius);

}

void area(int r)
{
	float result;
	result= PI*r*r;
	printf("Area of Circle is= %f",result);
	getch();
}
