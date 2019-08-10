#include <stdio.h>
int main() {
  int h;
  scanf("%d",&h);
  for(int i = 1 ; i <= h ; i++){
      if(i == 1 || i == h)
        for(int j = 1 ; j<= h ; j++)
          printf("*");
    else{
      for(int j = 1 ; j <= h ; j++)
        if(j==1 || j == h)
          printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
	return 0;
}