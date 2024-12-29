#include<stdio.h>

int main()
{
    int a, b, c;
    printf("This is a first program in C\n");
    printf("Please input two numbers\n");
    scanf("%d", &a);  
    scanf("%d", &b);  
    c = a + b;
    printf("The required number is: %d", c);  
    return 0;  
}