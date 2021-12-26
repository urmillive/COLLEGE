#include<stdio.h>
#include<conio.h>
void main()
{
    int age[5];
    int i;

    printf("\nEnter Value for 5 Elements in Age");
    for(i=0;i<5;i++)
    {
        scanf("%d",&age[i]);
    }

    printf("\nValue of AGE :");
    for(i=0;i<5;i++)
    {
        printf("\nage[%d] = %d",i,age[i]);
    }
    getch();
}
