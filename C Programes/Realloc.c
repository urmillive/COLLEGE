#include<stdio.h>
#include<conio.h>
int main()
{
    /*This Pointer Will hold the base
    address of the block created*/
    int* ptr;
    int n,i;
    //Get The Number of Elements For The Array
    n=5;
    printf("Enter Number Of Element: %d\n",n);
    //Dynamically allocate memory using calloc()
    ptr=(int*)calloc(n,sizeof(int));
    /*Check if the memory has been successfully
    allocated by malloc or not*/
    if(ptr==NULL)
    {
        printf("Memory not Allocated.\n");
        exit(0);
    }
    else
    {
        //Memory has been successfully allocated
        printf("Memory successfully Allocated using callox.\n");

        //Get the elements of the array
        for(i=0;i<n;++i)
        {
            ptr[i]=i+1; //1 2 3 4 5
        }
        //Print the element of the array
        printf("The Element Of the Array are:");
        for(i=0;i<n;++i)
        {
            printf("%d,",ptr[i]);
        }
        //Get the new size for The array
        n=10;
        printf("\n\nEnter the new size of the array: %d\n",n);

        //Dynamically re-allocated memory using realloc()
        ptr=realloc(ptr,n*sizeof(int));

        //Memory has benn Successfully allocated
        printf("Memory Successfully re-allocated using realloc.\n");

        //Get the new element of the array
        for(i=5;i<n;++i)
        {
            ptr[i]=i+1; //6 7 8 9
        }

    }

}
