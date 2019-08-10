#include <stdio.h>
int main() {
	// Type your code here
  int n,l=1;
  scanf("%d",&n);
  int num = n;
  for(int i = 1 ; i <= n ; i++){
    for(int j = 1 ; j < num ; j++){
      printf(" ");
    }
    num--;
    for(int k = 1 ; k <= l ; k++){
      printf("*");
    }
    l+=2;
    printf("\n");
  }
	return 0;
}