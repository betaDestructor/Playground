#include <stdio.h>
int main() {
  int n,sum=0;
  scanf("%d",&n);
  int o = n;
  while(n!=0){
  sum = sum + fact(n%10);
    n = n/10;
  }
  if(o == sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}
int fact (int n){
    int fac=1;
    for(int i = 1; i <= n ; i++)
      fac = fac * i;
	return fac;
}