#include <stdio.h>
int main(){
	// Type your code here
  int h,c=1;
  scanf("%d",&h);
  for(int i = 1 ; i <= h ; i++){
    for(int j = 1 ; j <= i ; j++){
      if(c % 2 == 0)
        printf("#");
      else
        printf("*");
      c++;
    }
    printf("\n");
  }
  	return 0;
}