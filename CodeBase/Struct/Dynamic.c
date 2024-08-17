#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Car
{
    char name[50];
    char model[50];
    int price;
};

int main()
{
    printf("Size : %d",sizeof(struct Car));

    struct Car* p = (struct Car*)malloc(sizeof(struct Car)); // Heap Memory

    strcpy(p->name,"BMW");
    strcpy(p->model,"xyz");
    p->price = 10000;

    printf("\n%s %s %d",p->name,p->model,p->price);

    return 0;
}


