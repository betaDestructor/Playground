#include<stdio.h>
int sum(int n)
{
  return n*(n+1)/2;
}
int main() {
   int n;
  scanf("%d",&n);
  n = sum(n);
  printf("%d",n);
  return 0;
}