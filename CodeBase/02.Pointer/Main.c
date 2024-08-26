#include <stdio.h>

struct Person {
    char name[50];
    int age;
};

void increment(int *n) {
    (*n)++;  // Increment the value at the pointer
}


int main(){

    int x = 10;
    int *ptr;
    ptr = &x;

    printf("Value of x: %d\n", x);                 // Output: 10
    printf("Address of x: %p\n", (void*)&x);       // Output: Address of x
    printf("Value stored at ptr: %p\n", (void*)ptr);  // Output: Address stored in ptr
    printf("Value pointed by ptr: %d\n", *ptr);    // Output: 10 (value of x)

    //  ---------------- Pointer in Array -------------------
    int arr[3] = {10, 20, 30};
    int *ptr1 = arr;  

    for(int i = 0; i < 3; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);          // Output: 10, 20, 30
        printf("*(ptr1 + %d) = %d\n", i, *(ptr1 + i));  // Output: 10, 20, 30
    }

    //  ---------------- Pointer in Structure -------------------
    struct Person person1 = {"John Doe", 30}; 
    struct Person *ptr2;                      

    ptr2 = &person1; 

    printf("Name: %s\n", ptr2->name);    // Output: John Doe
    printf("Age: %d\n", ptr2->age);      // Output: 30
    printf("Name: %s\n", (*ptr2).name);  // Output: John Doe
    printf("Age: %d\n", (*ptr2).age);    // Output: 30

    //  ---------------- Using Pointers with Functions -------------------
    increment(&x);

    printf("After increment: %d\n", x);   // Output: 11
}