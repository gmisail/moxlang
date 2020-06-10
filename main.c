#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Array {
} Array;
void Array_init(Array* self)
{
printf("this is an array test!");
}
void Array_destroy(Array* self)
{
}
Array* Array_alloc() {
Array* self = malloc(sizeof(Array));
Array_init(self);
return self;
}
typedef struct Coordinate {
int x;
int y;
} Coordinate;
void Coordinate_init(Coordinate* self)
{
self->x = 0;
self->y = 0;
}
void Coordinate_print(Coordinate* self)
{
}
void Coordinate_destroy(Coordinate* self)
{
}
Coordinate* Coordinate_alloc() {
Coordinate* self = malloc(sizeof(Coordinate));
Coordinate_init(self);
return self;
}
int main()
{
Array* array = Array_alloc();
Array_destroy(array);
free(array);
return 0;
}
