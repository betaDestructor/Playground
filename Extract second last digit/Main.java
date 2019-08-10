#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  n=n%100;
  n=n/10;
  printf("%d",n);
  return 0;
}