#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum = 0;
  for(int i = 1; i<=n ; i++)
    sum += i;
  printf("%d",sum);
	return 0;
}