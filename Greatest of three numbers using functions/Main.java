#include <stdio.h>
int big(int n1, int n2, int n3)
{
  int b = n1;
  if(n2 > b)
    b = n2;
  if(n3 > b)
    b = n3;
  return b;
}
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int b = big(n1,n2,n3);
  printf("%d",b);
  	return 0;
}