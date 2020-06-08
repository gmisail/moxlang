#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Array {
int* data;
int length;
} Array;
void Array_init(Array* self, int length)
{
self->length = length;
self->data = malloc(self->length * sizeof(int));
}
void Array_set(Array* self, int index, int value)
{
self->data[index] = value;
}
int Array_get(Array* self, int index)
{
return self->data[index];
}
void Array_destroy(Array* self)
{
free(self->data);
}
Array* Array_alloc(int length) {
Array* self = malloc(sizeof(Array));
Array_init(self, length);
return self;
}
int main()
{
Array* array = Array_alloc(4);
Array_set(array, 0, 0);
Array_set(array, 1, 0);
Array_set(array, 2, 4);
Array_set(array, 3, 8);
for(int i = 0; i < 4; i++){
printf("%i", Array_get(array, i));
}
Array_destroy(array);
free(array);
return 0;
}
