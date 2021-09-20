#include<stdio.h>
#include<conio.h>
void main()
{
    int disp[3][5];
    int i,j;
    //clrscr();
    for(i=0;i<3;i++)
    {
        for(j=0;j<5;j++)
        {
            printf("Enter Value for dipd[%d][%d]",i,j);
            scanf("%d",&disp[i][j]);
        }
    }
    printf("Two Dimentional Array Element\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<5;j++)
        {
            printf("%d",disp[i][j]);
            if(j==4)
            {
                printf("\n");
            }
        }
    }
    getch();
}
