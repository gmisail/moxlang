#include <stdio.h>
#include <stdlib.h>
float Math_pi = 3.14159;
float Math_e = 2.7;
float Math_sin()
{
return 0.0;
}
float Math_cos()
{
return 0.0;
}
float Math_areaOfCircle(float radius)
{
return Math_pi * (radius * radius);
}

int main()
{
printf("the area of a circle with radius 5 is %f", Math_areaOfCircle(5));
}