#include <stdio.h>
int gcd(int n1, int n2)
{
  if(n1 == 0)
    return n2;
  return gcd(n2 % n1, n1);
}
int main() {
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int n = gcd(n1,n2);
  n1 = gcd(n,n3);
  printf("%d",n1);
	return 0;
}