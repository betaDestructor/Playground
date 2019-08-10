#include<stdio.h>
#include<string.h>
int main()
{
  char str1[20], str2[20];
  scanf("%s",str1);
  scanf("%s",str2);
  char temp[strlen(str1)];
  strcpy(temp,str1);
  strcat(temp,str1);
  if(strstr(temp,str2))
  {
    printf("Yes");
    exit(0);
  }
  printf("No");
  return 0;
}