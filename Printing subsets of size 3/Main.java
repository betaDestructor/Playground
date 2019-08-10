#include<stdio.h>
int main()
{
//Try out your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  for(int i = 0 ; i < n-1 ; i++)
  {
    for(int j = i+1 ; j < n ; j++)
    {
      for(int k = j+1 ; k < n ; k++)
         printf("(%d, %d, %d) ", a[i],a[j],a[k]);
    }
    printf("\n");
  }
return 0;
}