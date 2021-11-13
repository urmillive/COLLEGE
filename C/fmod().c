#include<stdio.h>
#include<math.h>

int main()
{
    float a,b;
    int c;
    a=9.2;
    b=3.7;
    c=2;

    printf("Remainder Of %f / %d is %lf\n",a,c,fmod(a,c));
    printf("Remainder Of %f / %f is %lf\n",a,b,fmod(a,b));

    return(0);
}
