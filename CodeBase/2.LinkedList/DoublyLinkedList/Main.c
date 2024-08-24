#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct ListNode Node;

struct ListNode
{
    int data;
    Node *prev;
    Node *next;
};

Node *head = NULL;
Node *tail = NULL;

void insertAtBeginning(int value)
{

    Node *newNode = (Node *)malloc(sizeof(Node));

    if (newNode == NULL)
    {
        printf("Memory Allocation Failed.");
        return;
    }

    newNode->data = value;
    newNode->prev = NULL;

    if (head == NULL && tail == NULL)
    {
        tail = newNode;
        printf("\nINSERTED base position.");
    }
    else
    {
        head->prev = newNode;
        printf("\nINSERTED at Beginning.");
    }

    newNode->next = head;
    head = newNode;
}

void insertAtEnd(int value)
{

    if (head == NULL && tail == NULL)
    {
        insertAtBeginning(value);
        return;
    }
    else
    {

        Node *newNode = (Node *)malloc(sizeof(Node));

        if (newNode == NULL)
        {
            printf("Memory Allocation Failed.");
            return;
        }

        newNode->data = value;
        newNode->next = NULL;

        tail->next = newNode;
        newNode->prev = tail;

        tail = newNode;
        printf("\nINSERTED at End.");
    }
}

void insertAtPosition(int pos, int value)
{

    if (pos == 0)
    {
        insertAtBeginning(value);
        return;
    }
    else
    {

        Node *newNode = (Node *)malloc(sizeof(Node));

        if (newNode == NULL)
        {
            printf("Memory Allocation Failed.");
            return;
        }

        newNode->data = value;

        Node *temp = head;

        for (int i = 1; i < pos; i++)
        {
            temp = temp->next;

            if (temp == NULL)
            {
                printf("\nNO Position Found.");
                return;
            }
        }

        if (temp->next == NULL)
        {
            newNode->next = NULL;
            newNode->prev = temp;
            temp->next = newNode;
            tail = newNode;
        }
        else
        {
            newNode->next = temp->next;
            newNode->prev = temp;
            temp->next->prev = newNode;
            temp->next = newNode;
        }

        printf("\nINSERTED at Position.");
    }
}

void deleteAtPosition(int pos)
{

    if (head == NULL)
    {
        printf("\nNo data Found!");
        return;
    }

    Node *temp = head;

    if (pos == 0)
    {
        head->next->prev = NULL;
        head = head->next;
        free(temp);
        return;
    }

    for (int i = 0; i < pos; i++)
    {
        temp = temp->next;
        if (temp == NULL)
        {
            printf("\nNo Position Found!");
            return;
        }
    }

    if (temp->next == NULL)
    {
        temp->prev->next = NULL;
        tail = temp->prev;
    }
    else
    {
        temp->prev->next = temp->next;
        temp->next->prev = temp->prev;
    }

    free(temp);
}

void displayForward()
{
    printf("\nForward ");
    Node *temp = head;

    while (temp != NULL)
    {
        printf("%d --> ", temp->data);
        temp = temp->next;
    }
    printf(" null");
}

void displayBackward()
{
    printf("\nBackward ");

    Node *temp = tail;

    while (temp != NULL)
    {
        printf("%d --> ", temp->data);
        temp = temp->prev;
    }
    printf(" null");
}

int main()
{

    insertAtBeginning(0);
    insertAtBeginning(1);
    insertAtBeginning(2);
    insertAtEnd(10);
    insertAtEnd(20);
    insertAtPosition(1, 11);
    deleteAtPosition(4);

    displayForward();
    displayBackward();

    return 0;
}
