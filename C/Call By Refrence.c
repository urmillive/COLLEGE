//call by reference demo
#include<stdio.h>
#include<conio.h>
void change(int *num)
{
    int a=50;
    printf("\nBefore adding value inside function NUM= %d",*num);
    a+=*num;
    *num=a;
}
void main()
{
    int x=100;
    //clrscr;
    printf("Before function call main X= %d",x);
    change(&x);
    printf("\nAfter function call X= %d",x);
    getch();
}
