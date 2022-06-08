#include<stdio.h>
#include<conio.h>
void main()
{
    int sr[10];
    int i;
    int j=0;
    //clrscr();

    for(i=0;i<10;i++);
    {
        j++;
        sr[i]=j*j;
    }
    printf("\nSquare of 1 to 10");
    for(i=0;i<10;i++)
    {
        printf("\nSquare %d",sr[i]);
    }
    getch();
}
