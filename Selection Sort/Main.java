#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i,j,min,t;
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  for(i = 0 ; i < n - 1 ; i++)
  {
    min = i;
    for(j = i + 1 ; j < n ; j++)
      if(a[min] > a[j])
        min = j;
    t = a[i];
    a[i] = a[min];
    a[min] = t;
  }
  for(i = 0 ; i < n ; i++)
    printf("%d\n",a[i]);
  return 0;
}