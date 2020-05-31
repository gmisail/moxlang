#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Node {
struct Node* next;
struct Node* prev;
} Node;
void Node_init(Node* self)
{
}
void Node_destroy(Node* self)
{
}
Node* Node_alloc() {
Node* self = malloc(sizeof(Node));
Node_init(self);
return self;
}
typedef struct List {
Node* head;
Node* tail;
} List;
void List_init(List* self)
{
}
void List_destroy(List* self)
{
}
List* List_alloc() {
List* self = malloc(sizeof(List));
List_init(self);
return self;
}
int main()
{
}
