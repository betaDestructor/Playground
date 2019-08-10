#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
  char str[100],str1[100];
  int count = 0;
  gets(str);
  gets(str1);
  int str_len = strlen(str), str1_len = strlen(str1);
  for(int i = 0 ; i < str_len ; i++)
  {
    str[i] = tolower(str[i]);
  }
  for(int i = 0 ; i < str1_len ; i++)
  {
    str1[i] = tolower(str1[i]);
  }
  int j = 0;
  for(int i = 0 ; str[i] != '\0' ; i++)
  {
    j = 0;
    if(str[i] == str1[j])
    {
      for(int k = i ; j < str1_len ; k++)
      {
        if(str[k] == str1[j])
          j++;
        else
            break;
        if(j == str1_len)
            count++;
      }
    }
  }
  printf("%d",count);
return 0;
}