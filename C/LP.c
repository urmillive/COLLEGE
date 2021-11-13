#include<stdio.h>
#include<conio.h>
void main()
{
    int i=0;
    temp:
    printf("\n%d",i);
    i=i+1;
    if(i<=100)
    {
        goto temp;
    }
    getch();
}
