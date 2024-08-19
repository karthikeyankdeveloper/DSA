#include <stdio.h>
#include <stdlib.h>
void DynamicMemoryAllocation();

int main()
{
    // malloc, realloc, calloc, free
    DynamicMemoryAllocation();
}

void DynamicMemoryAllocation()
{
    int size;
    printf("Int Size %d byte, Enter Size of Element in Int Array : ", sizeof(int));
    scanf("%d", &size);

    // int* p = (int*)malloc(sizeof(int)*size);
    int *p = (int *)calloc(size, sizeof(int));

    if (p == NULL)
    {
        printf("Memory Allocation Failed");
        return;
    }
    printf("Memory Allocated, Base Address : %d \n", p);

    for (int i = 0; i < size; i++)
    {
        printf("Enter  %d Index :", i);
        scanf("%d", &p[i]);
    }

    printf("\nValues Entered :\n");

    for (int j = 0; j < size; j++)
    {
        printf(" Value : %d Address : %d \n", p[j], &p[j]);
    }

    int newsize;
    printf("Int Size %d byte, Enter Size of Int Array : ", sizeof(int));
    scanf("%d", &newsize);

    int *temp = (int *)realloc(p, sizeof(int) * newsize);

    if (temp == NULL)
    {
        printf("Memory Allocation Failed");
        return;
    }
    printf("Memory Allocated, Base Address : %d \n", temp);

    if (size < newsize)
    {
        for (int i = size; i < newsize; i++)
        {
            printf("Enter  %d Index :", i);
            scanf("%d", &temp[i]);
        }
    }

    temp = p;

    printf("\nValues Entered :\n");

    for (int j = 0; j < newsize; j++)
    {
        printf(" Value : %d Address : %d \n", p[j], (void *)(p + j));
    }

    free(p);
}
