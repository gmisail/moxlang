#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Array {
int size;
int* data;
} Array;
void Array_init(Array* self, int size)
{
self->size = size;
self->data = calloc(self->size, sizeof(int));
}
int Array_get(Array* self, int index)
{
if (index < self->size && index >= 0){
return self->data[index];
}
else{
return 0;
}
}
void Array_set(Array* self, int index, int value)
{
if (index < self->size && index >= 0){
self->data[index] = value;
}
}
void Array_destroy(Array* self)
{
free(self->data);
}
Array* Array_alloc(int size) {
Array* self = malloc(sizeof(Array));
Array_init(self, size);
return self;
}
typedef struct Grid {
Array* data;
int width;
int height;
} Grid;
void Grid_init(Grid* self)
{
self->data = Array_alloc(self->width * self->height);
for(int y = 0; y < self->height; y++){
for(int x = 0; x < self->width; x++){
int id = 0;
if (x % 2 == 0 && y % 2 == 0){
id = 1;
}
Array_set(self->data, y * 10 + x, id);
}
}
}
void Grid_render(Grid* self)
{
for(int y = 0; y < self->height; y++){
for(int x = 0; x < self->width; x++){
if (Array_get(self->data, y * self->width + x) == 0){
printf("@");
}
else{
printf("#");
}
}
printf("\n");
}
}
void Grid_destroy(Grid* self)
{
printf("destroying grid object");
Array_destroy(self->data);
free(self->data);
}
Grid* Grid_alloc() {
Grid* self = malloc(sizeof(Grid));
self->width = 10;
self->height = 10;
Grid_init(self);
return self;
}
int main()
{
Grid* grid = Grid_alloc();
Grid_render(grid);
Grid_destroy(grid);
free(grid);
return 0;
}
