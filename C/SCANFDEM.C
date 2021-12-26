//This is demo of scanf.
/*At Sunday by JAP.
*/
#include<stdio.h>
#include<conio.h>
void main()		//start
{

	int a;
	int b;
	clrscr();

	printf("Enter Value for A = \t");
	scanf("%d",&a);
	printf("\nEntered Value for A from You is = %d",a);
	printf("\nEnter a Value for B = \t");
	scanf("%d",&b);
	printf("\nYour entered value for B is = %d",b);
	printf("\nSUM of A+B = %d",a+b);
	getch();		//stop
}