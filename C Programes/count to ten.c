#include<stdio.h>
#include<conio.h>
void count_to_ten(int cnt)
{
    printf("**%d**",cnt);
    if(cnt<10)
    {
        count_to_ten(cnt+1);
    }
}
void main()
{
    count_to_ten(0);
    getch();
}
