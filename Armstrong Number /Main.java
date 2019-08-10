#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int o=n,i=0;
  int sum=0;
  while(n!=0){
    n=n/10;
    i++;
  }
  n=o;
  while(n!=0)
  {
     sum = sum + pow((n%10),i);
     n=n/10;
  }
  if(o==sum)
  {
    printf("Armstrong Number");  
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}