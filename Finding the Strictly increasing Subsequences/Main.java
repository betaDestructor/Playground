#include<stdio.h>
int main()
{
int size,flag = 0;
  scanf("%d",&size);
  int array[size];
  int i,k;
  for(i = 0 ; i < size ; i++)
  {
    scanf("%d",&array[i]);
  }
  for(i = 0 ; i < size ; i++)
  {
    for(int j = i ; j < size ; j++)
    {
      if(array[i] < array[j])
      {
      	for(int k = i ; k < j ; k++)
      	{
      		if(j-k >=1)
      		if(array[j] - array[k] <= 0)
      			flag = 1;
      	}
      }
      if(flag == 0 && array[j]>array[i])
      printf("%d,%d\n",array[i],array[j]);
  flag = 0;
    }
    }
return 0;
}