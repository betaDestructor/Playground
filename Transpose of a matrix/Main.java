#include<stdio.h>
int main()
{
  int m,n,i,j;
  scanf("%d%d",&m,&n);
  int array[m][n];
  for(i = 0 ; i < m ; i++)
    for(j = 0 ; j < n ; j++)
      scanf("%d",&array[i][j]);
  for(i = 0 ; i < n ; i++)
  {
    for(j = 0 ; j < m ; j++)
      printf("%d ",array[j][i]);
    printf("\n");
  }

  return 0;
}