#include<stdio.h>
#include<conio.h>
void main()
{
    int age;
    //clrscr();
    printf("\nEnter Age");
    scanf("%d",&age);
    if(age>=18 && age<=60)
    {
        printf("\nYou are Eligible for Driving Licence");
        printf("\nYour Age is = %d",age);
    }
    else
    {
        printf("\nYoy are not Eligible for Driving Licence");
    }
    printf("\n");
    getch();
}
