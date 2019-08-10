#include <stdio.h>
int main() {
	//Type your code
  int n,l;
  scanf("%d",&n);
  while(n>9){
    if(n<=99)
      break;
  n=n/10;
  }
  l = n%10;
  printf("%d",l);
	return 0;
}