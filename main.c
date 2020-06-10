#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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
typedef struct Coordinate {
} Coordinate;
void Coordinate_init(Coordinate* self){}
void Coordinate_destroy(Coordinate* self){}
Coordinate* Coordinate_alloc() {
Coordinate* self = malloc(sizeof(Coordinate));
Coordinate_init(self);
return self;
}
int main()
{
return 0;
}
