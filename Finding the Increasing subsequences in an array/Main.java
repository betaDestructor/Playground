#include<stdio.h>
int main()
{
int size;
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
      	printf("%d,%d\n",array[i],array[j]);
    }
  }
return 0;
}