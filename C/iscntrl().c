#include<stdio.h>
#include<ctype.h>

int main()
{
    char c;
    int result;

    c='Q';
    result=iscntrl(c);
    Printf("When %c is passed to iscntrl()= %d\n",c,result);

    c='\n';
    result=iscntrl(c);
    print("When %c is passed to iscntrl()= %d",c,result);

    getch();
}
