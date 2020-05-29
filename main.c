#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct {
int age;
Human friend;
} Human;
void Human_init(Human* self)
{
}
void Human_destroy(Human* self)
{
}
Human* Human_alloc() {
Human* self = malloc(sizeof(Human));
Human_init(self);
return self;
}
int main()
{
int age = 19;
Human* human = Human_alloc();
Human_destroy(human);
free(human);
}
