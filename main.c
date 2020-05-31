#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Node {
struct Node* next;
int value;
} Node;
void Node_init(Node* self)
{
}
void Node_destroy(Node* self)
{
if (self->next != NULL){
}
}
void Node_print(Node* self)
{
printf("%i -> ", self->value);
if (self->next != NULL){
Node_print(self->next);
}
}
Node* Node_alloc() {
Node* self = malloc(sizeof(Node));
Node_init(self);
return self;
}
typedef struct List {
Node* head;
Node* tail;
int num;
} List;
void List_init(List* self)
{
}
void List_destroy(List* self)
{
}
void List_print(List* self)
{
Node_print(self->head);
}
List* List_alloc() {
List* self = malloc(sizeof(List));
self->num = 0;
List_init(self);
return self;
}
int main()
{
List* list = List_alloc();
list->head = Node_alloc();
list->head->value = 10;
list->head->next = Node_alloc();
list->head->next->value = 20;
List_print(list);
Node_print(list->head);
List_destroy(list);
free(list);
}
