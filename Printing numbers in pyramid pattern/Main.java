#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int num = n;
  int c = 1;
  for(int i = 1 ; i <= n ; i++){
    for(int j = 1 ; j <= num-1 ; j++){
      printf(" ");
    }
    num--;
    for(int k = 1 ; k <= i ; k++){
      printf("%d ",c);
    c++;}
    printf("\n");
  }
	return 0;
}