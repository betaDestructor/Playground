// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,b=0;
  scanf("%d",&n);
  int a[n];
  for(int i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  b = a[0];
  int index = 0;
  for(int i = 1 ; i < n ; i++)
  {
    if(b < a[i])
    {
      b = a[i];
      index = i;
    }
  }
  printf("%d",index);
   return 0;
}


