#include<stdio.h>
#include<ctype.h>

int main()
{
    char c;
    c='W';
    printf("\nResult when uppercase alphabet is passed: %d",isalpha(c));

    c='w';
    printf("\nResult when lowercase alphabet is passed: %d",isalpha(c));

    c='-';
    printf("\nResult when non-alphabetic character is passed: %d",isalpha(c));

    getch();
}
