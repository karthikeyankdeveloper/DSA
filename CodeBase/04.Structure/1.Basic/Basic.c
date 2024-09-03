#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// Not able to declare below main
struct Car{
    char name[50];
    char model[50];
    int price;
} car3, car4;

int main()
{

    struct Car car2 = {"Ford", "Mustang", 50000};

    struct Car car1 = {"BMW"};
    strcpy(car1.model, "x9");
    car1.price = 25000;


    strcpy(car3.model, "x9");
    strcpy(car3.name, "test");
    car3.price = 25000;

    printf("%s %s %d\n", car1.name, car1.model, car1.price);
    printf("%s %s %d\n", car2.name, car2.model, car2.price);
    printf("%s %s %d\n", car3.name, car3.model, car3.price);
    printf("%s %s %d\n", car4.name, car4.model, car4.price);

    return 0;
}
