#include <stdio.h>
int main() {
  int h;
  scanf("%d",&h);
  for(int i = 1 ; i <= h ; i++){
    if(i % 2 == 1){
    for(int j = 1 ; j <=h ; j++){
    if(j == h)
    printf("%d",i+1);
    else
      printf("%d",i);
    }
    printf("\n");
  }
    else{
     for(int j = 1; j <= h;j++){
         int a = i+1;
    if(j == 1)
    printf("%d",a);
    else
      printf("%d",i);
    }
    printf("\n");
    }
  }
	return 0;
}