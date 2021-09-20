//This Program For SWITCH_CASE Example
/*This Program Written by JAP
  on 30 Sep,2020
*/
#include<stdio.h>
#include<conio.h>
void main()
{
     int num;
     clrscr();
     printf("Enter Month Number = ");
     scanf("%d" ,&num);
     switch(num)
     {
       case 1:
	 printf("You are Entered Number For January");
	 break;
       case 2:
	 printf("You are Entered Number For Fabruary");
	 break;
       case 3:
	 printf("You are Entered Number For March");
	 break;
       case 4:
	 printf("You are Entered Number For April");
	 break;
       case 5:
	 printf("You are Entered Number For May");
	 break;
       case 6:
	 printf("You are Entered Number For June");
	 break;
       case 7:
	 printf("You are Entered Number For July");
	 break;
       case 8:
	 printf("You are Entered Number For August");
	 break;
       case 9:
	 printf("You are Entered Number For September");
	 break;
       case 10:
	 printf("You are Entered Number For October");
	 break;
       case 11:
	 printf("You are Entered Number For November");
	 break;
       case 12:
	 printf("You are Entered Number For December");
	 break;
     default:
       printf("You are not Entered Proper Month Number!");
       break;
     }
    getch();
}