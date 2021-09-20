//Sum of Total digit
#include<stdio.h>
#include<conio.h>

void main()
{
    int i=654,m;
    int sum;
    //clrscr();
    while(i>0)
    {
        m=i%10;
        printf("\n REM=%d",m);
        sum=sum+m;
        i=i/10;
    }
    printf("\n ANS=%d",sum);
    getch();
}
