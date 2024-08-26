#include <stdio.h>
#include <stdlib.h>

typedef struct Node node; // aliase or shorter name

struct Node
{
    int data;
    node *next; // self -reference Structure
    //struct Node *node;
};

struct Node *head = NULL;

void insertAtBeginning(int value)
{

    //node *newNode = (node*)malloc(sizeof(node));
    struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL)
    {
        printf("Memory Allocation Failed !\n");
        return;
    }
    newNode->data = value;

    if (head == NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        newNode->next = head;
        head = newNode;
    }
    printf("Value %d Inserted At Beginning\n\n", value);
}

void insertAtPosition(int pos, int value)
{
    node *newNode = (node *)malloc(sizeof(node));
    if (newNode == NULL)
    {
        printf("Memory Allocation Failed !\n");
        return;
    }
    newNode->data = value;

    node *temp = head;

    for (int i = 1; i < pos; i++)
    {
        temp = temp->next;

        if (temp == NULL)
        {
            printf("No such Position Found!\n");
            return;
        }
    }

    newNode->next = temp->next;
    temp->next = newNode;
    printf("Value %d Inserted At Position %d\n\n", value, pos);
}

void deleteAtPosition(int pos)
{
    node *temp = head;
    node *prev = head;

    if (pos == 0)
    {
        head = temp->next;
        printf("Value %d Deleted At Position %d\n", temp->data, pos);
        free(temp);
        return;
    }

    for (int i = 1; i <= pos; i++)
    {
        prev = temp;
        temp = temp->next;

        if (temp == NULL)
        {
            printf("No such Position Found!\n");
            return;
        }
    }

    prev->next = temp->next;
    printf("Value %d Deleted At Position %d\n", temp->data, pos);
    free(temp);
}

void insertAtEnd(int value)
{
    node *newNode = (node *)malloc(sizeof(node));
    if (newNode == NULL)
    {
        printf("Memory Allocation Failed !\n");
        return;
    }
    newNode->data = value;

    if (head == NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {

        node *temp = head;

        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        //newNode->next = NULL;
        temp->next = newNode;
        temp->next->next = NULL;
    }

    printf("Value %d Inserted At End\n\n", value);
}

void display()
{
    if (head == NULL)
    {
        printf("No Data Found !\n");
        return;
    }

    node *temp = head;

    printf("Elements : [ ");

    while (temp != NULL)
    {
        printf("%d --> ", temp->data);
        temp = temp->next;
    }

    printf("null ]\n\n");
}

int main()
{

    while (1)
    {
        printf("1.Insert At Beginning \n");
        printf("2.Insert At End \n");
        printf("3.Insert At Position \n");
        printf("4.Delete At Position \n");
        printf("5.Display \n");
        printf("6.Exit \n");
        // printf("\nEnter Your Option : ");
        // printf("\nEnter Your Option : ");

        printf("\nEnter Your Option : ");
        int option;
        scanf("%d", &option);

        int value, pos;

        switch (option)
        {
        case 1: // Insert At Beginning
            printf("\nEnter Insert Value : ");
            scanf("%d", &value);
            insertAtBeginning(value);
            break;
        case 2: // Insert At End
            printf("\nEnter Insert Value : ");
            scanf("%d", &value);
            insertAtEnd(value);
            break;
        case 3: // Insert At Position
            printf("\nEnter Insert Position : ");
            scanf("%d", &pos);
            printf("\nEnter Insert Value : ");
            scanf("%d", &value);

            if (pos == 0)
            {
                insertAtBeginning(value);
                break;
            }

            insertAtPosition(pos, value);
            break;
        case 4: // Delete at position
            printf("\nEnter Delete Position : ");
            scanf("%d", &pos);
            deleteAtPosition(pos);
            break;
        case 5: // display
            display();
            break;
        case 6: // exit
            return 0;
            //break;
        default:
            printf("Wrong Input\n");
        }
    }
}
