#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  int n1,n2;
  scanf("%d%d",&n1,&n2);
  int pos1=-1,pos2=-1;
  for(int i = 0 ; i < n ; i++)
  {
    if(n1 == a[i])
    {
      pos1 = i;
    }
    if(n2 == a[i])
    {
      pos2 = i;
    }
  }
  if(pos1>=0)
    printf("%d\n",pos1);
  else
    printf("-1\n");
  if(pos2>=0)
    printf("%d\n",pos2);
  else
    printf("-1");
  return 0;
}