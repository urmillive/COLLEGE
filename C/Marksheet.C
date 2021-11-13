/*This is about marksheet of students.
  This is created at 09-08-2020
  by JAP.
*/
#include<stdio.h>
#include<conio.h>
void main()
{
	int rno;
	int commskill;
	int clang;
	int funda;
	int html;
	int sum;
	float per;
	clrscr();

	printf("Enter Your Roll No: = ");
	scanf("%d",&rno);
	printf("Enter Marks For  C.Skill = ");
	scanf("%d",&commskill);
	printf("Enter Marks For C Lang = ");
	scanf("%d",&clang);
	printf("Enter Marks For Com.Fund. = ");
	scanf("%d",&funda);
	printf("Enter Marks For HTML = ");
	scanf("%d",&html);
	sum=commskill+clang+funda+html;
	per=(sum/4);

	 printf("*********MARKSHEEt*********");
	 printf("\nRoll No= %d" ,rno);
	 printf("\n Totle Marks = %d",sum);
	 printf("\n Percentage = %2f" ,per);
	 getch();

}