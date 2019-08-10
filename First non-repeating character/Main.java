#include<stdio.h>
#include<stdlib.h>
int main()
{
	char str[100];
  	int flag = 0;
  	scanf("%s",str);
  	for(int i = 0 ; str[i] != '\0' ; i++)
    {
      for(int j = 0 ; str[j] != '\0' ; j++)
      {
				if(i == j)
				{
					continue;
				}
        if(str[i] == str[j])
        {
					//printf("\nInside if: str[i] = %c || str[j] = %c\n\n",str[i],str[j]);
          flag = 1;
          break;
        }
      }
      if(flag == 0)
      {
        printf("%c",str[i]);
        exit(0);
      }
			flag = 0;
    }
  	printf("All the characters are repetitive");
	return 0;
}