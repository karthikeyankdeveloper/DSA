#include<stdio.h>;

void main(){
    int sum = 10+10;
    int arrayZero[] = {1,2,3}; //int[] arrayZero - Not possible
    int arrayOne[3];
    arrayOne[0] =  0;
    arrayOne[1] =  1;
    arrayOne[2] =  2;

    int *arrayTwo = arrayOne;
    arrayTwo[0] =  4;

    printf("Address of One : %d\n",&arrayOne);
    printf("Value of Two : %d\n",arrayTwo); 
    printf("Address of Two : %d\n",&arrayTwo);
    printf("0 Index One : %d\n",arrayOne[0]);
    printf("0 Index Two : %d\n",arrayTwo[0]);
    printf("Size Of int: %d\n",sizeof(int));
    printf("Find size of Array: %d\n",sizeof(arrayOne)/sizeof(arrayOne[0]));

    char cArray[] = {'a','b','c'};

    printf("Value of cArray : %c %c %c",cArray[0],cArray[1],cArray[2]);
}
