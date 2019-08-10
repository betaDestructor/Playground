#include<stdio.h>
int main()
{
  //Type your code here
  int n,t;
  scanf("%d",&n);
  int i,a[n];
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  int j = 0,v;
  for(i = 1 ; i < n ; i++)
  {
    v = a[i];
    j = i - 1;
    while(j >= 0 && a[j] > v)
    {
      a[j + 1] = a[j];
      j--;
    }
    a[j+1] = v;
  }
   for(i = 0 ; i < n ; i++)
    printf("%d\n",a[i]);
  return 0;
}