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
    struct Car car[50];

    strcpy(car[0].name,"BMW");
    strcpy(car[0].model,"x9");
    car[0].price = 25000;

    strcpy(car[1].name, "Ford");
    strcpy(car[1].model, "Mustang");
    car[1].price = 50000;


    printf("Row 1 : %s %s %d\n", car[0].name, car[0].model, car[0].price);
    printf("Row 2 : %s %s %d\n", car[1].name, car[1].model, car[1].price);

    return 0;
}


