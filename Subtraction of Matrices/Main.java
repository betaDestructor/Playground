#include<stdio.h>
int main()
{
  int m,n,i,j;
  scanf("%d%d",&m,&n);
  int array[m][n],array2[m][n];
  for(i = 0 ; i < m ; i++)
    for(j = 0 ; j < n ; j++)
      scanf("%d",&array[i][j]);
  for(i = 0 ; i < m ; i++)
    for(j = 0 ; j < n ; j++)
      scanf("%d",&array2[i][j]);
  for(i = 0 ; i < m ; i++)
  {
    for(j = 0 ; j < n ; j++)
    {
      printf("%d ",array[i][j] - array2[i][j]);
    }
    printf("\n");
  }
  return 0;
}
