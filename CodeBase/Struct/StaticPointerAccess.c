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
    struct Car car = {"Ford", "Mustang", 50000}; //In Stack Memory
    struct Car *p;
    p = &car;
    //p.price dot operation not possible because it is structure function
    // Another idea is access using address *p.price , but it not work due to dot have high priority compare to *.
    // Another one way is Initially point address and dot operation (*p).price
    printf("%d",(*p).price);
    //But is more difficult to handle , that's why c have inbuilt way to access through memory
    printf("\n%d",p->price);
    
    strcpy(p->name,"BMW");
    p->price = 10000;

    printf("\n%s %d",p->name,p->price);

    return 0;
}


