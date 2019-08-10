#include<stdio.h>
#include<stdlib.h>
int check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[size], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    int c = check_sum_and_display(arr, size, sum);
    if(c == 0)
      printf("No perfect couple found!");
    return 0;
}

int check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here
  int s = 0;
  for(int i = 0 ; i < size ; i++)
  {
    for(int j = 0 ; j < size ; j++)
    {
      if( i == j )
        continue;
      s = arr[i] + arr[j];
      if( s == sum)
      {
        printf("Perfect couple: %d %d",arr[i],arr[j]);
        return 1;
      }
    }
  }
  return 0;
}