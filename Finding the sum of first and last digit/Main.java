#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum = n%10;
  while(n>9)
  n=n/10;
  sum = sum +n;
  printf("%d",sum);
	return 0;
}