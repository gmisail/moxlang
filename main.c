#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Vector {
int* data;
int len;
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
if (self->len == 0){
self->len = 4;
self->data = calloc(self->len, sizeof(int));
for(int i = 0; i < self->len; i++){
self->data[i] = 0;
}
}
if (self->len == self->count){
self->len = self->len * 2;
self->data = realloc(self->data, sizeof(int) * self->len);
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
self->len = 0;
self->count = 0;
Vector_init(self);
return self;
}
int main()
{
Vector* vec = Vector_alloc();
Vector_push(vec, 0);
Vector_push(vec, 3);
Vector_push(vec, 6);
Vector_destroy(vec);
free(vec);
}
