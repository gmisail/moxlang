#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int fib(int n)
{
if (n == 0 || n == 1){
return n;
}
else{
return fib(n - 2) + fib(n - 1);
}
}
int main()
{
printf("%i", fib(10));
return 0;
}
