//This is demo programed by Jeet Patel
/*
  this is demo This is created on 23-08-2020
  of
  c
  program
*/
#include<stdio.h>
#include<conio.h>
void main()
{
   int age; // %d  // datatype variable_name;  %d
   char surname;  // %c
   char first_name[25]="Jeet";  // %s                  // %c
   surname='P';
   age=17;   // storing a value in variable

   clrscr();
   printf("I am student of BCA semester 1!\n");
   printf("my name is = Kishan");
   printf("\n He told \" You are the best \" ");
   printf("\n Hello\thow\tare\t\tyou");
   printf("\n My AGE is =  25");
   printf("\n MY AGE is : %d ",age);
   printf("\n My surname is = %c",surname);
   printf("\n My first NAME = %s ",first_name);

   printf("\n\n\n ***************** \n");
   printf(" NAME = %c\t SURNAME = %c\tAnd My age = %d",first_name,surname,age);
   getch();


}