#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Vector {
int x;
int y;
} Vector;
void Vector_init(Vector* self, int x, int y)
{
self->x = x;
self->y = y;
}
int Vector_dot(Vector* self, Vector* vec)
{
return (self->x * vec->x) + (self->y * vec->y);
}
void Vector_destroy(Vector* self)
{
}
Vector* Vector_alloc(int x, int y) {
Vector* self = malloc(sizeof(Vector));
Vector_init(self, x, y);
return self;
}
int main()
{
Vector* foo = Vector_alloc(10, 5);
Vector* bar = Vector_alloc(5, 10);
int result = Vector_dot(foo, bar);
printf("the result is %i", result);
Vector_destroy(foo);
free(foo);
Vector_destroy(bar);
free(bar);
return 0;
}
