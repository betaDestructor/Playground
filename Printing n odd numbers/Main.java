#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int odd=1;
  for(int i = 0 ; i < n ; i++){
  printf("%d\n",odd);
    odd+=2;
  }
	return 0;
}