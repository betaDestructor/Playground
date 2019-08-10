#include<stdio.h>
int sq(int n)
{
  return n*n;
}
int main() {
   int n;
  scanf("%d",&n);
  n = sq(n);
  printf("%d",n);
   return 0;
}