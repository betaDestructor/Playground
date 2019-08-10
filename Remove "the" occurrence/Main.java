#include<stdio.h>
#include<stdlib.h>
int main()
{
	char str[100];
  	int flag = 0;
  	scanf("%[^\n]s",str);
    for(int i = 0 ; str[i] != '\0' ; i++)
    {
      if(str[i] == 't' || str[i] == 'T')
      {
        if(str[i+1] == 'h' || str[i+1] == 'H')
        {
          if(str[i+2] == 'e' || str[i+2] == 'E')
          {
            i = i+3;
            continue;
          }
        }
      }
      printf("%c",str[i]);
    }
    return 0;
}