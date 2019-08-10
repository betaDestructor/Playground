#include<stdio.h>
int main()
{
  //Type your code here
    int n;
  scanf("%d",&n);
  int a[n],i,j,t;
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  for(i = 0 ; i < n - 1 ; i++)
  {
    for(j = 0 ; j <= n - i - 2 ; j++)
    {
      if(a[j] > a[j+1])
      {
        t = a[j + 1];
        a[j+1] = a[j];
        a[j] = t;
      }
    }
  }
   for(i = 0 ; i < n ; i++)
    printf("%d\n",a[i]);
  return 0;
}