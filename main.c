#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct {
int*  data;
int size;
int count;
} Vector;
void Vector_init(Vector* self)
{
}
void Vector_destroy(Vector* self)
{
free(self->data);
}
int Vector_count(Vector* self)
{
return self->count;
}
void Vector_push(Vector* self, int value)
{
if (self->size == 0){
self->size = 4;
self->data = calloc(self->size, sizeof(int));
for(int i = 0; i < self->size; i++){
self->data[i] = 0;
}
}
if (self->size == self->count){
self->size = self->size * 2;
self->data = realloc(self->data, sizeof(int) * self->size);
}
self->data[self->count] = value;
self->count = self->count + 1;
}
void Vector_set(Vector* self, int index, int value)
{
if (index < self->count && index >= 0){
self->data[index] = value;
}
}
int Vector_get(Vector* self, int index)
{
if (index < self->count && index >= 0){
return self->data[index];
}
return 0;
}
int Vector_pop(Vector* self)
{
int val = Vector_get(self, self->count - 1);
Vector_set(self, self->count - 1, 0);
self->count = self->count - 1;
return val;
}
void Vector_print(Vector* self)
{
printf("[");
for(int i = 0; i < self->count; i++){
if (i > 0){
printf(", ");
}
printf("%i", Vector_get(self, i));
}
printf("]\n");
}
Vector* Vector_alloc() {
Vector* self = malloc(sizeof(Vector));
self->data = NULL;
self->size = 0;
self->count = 0;
Vector_init(self);
return self;
}
int main()
{
Vector* vector = Vector_alloc();
for(int i = 0; i < 5; i++){
Vector_push(vector, i);
Vector_print(vector);
}
for(int i = 0; i < 5; i++){
Vector_pop(vector);
Vector_print(vector);
}
Vector_destroy(vector);
free(vector);
}
