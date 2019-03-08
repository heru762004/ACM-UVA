// Cost Cutting Problem :
// https://uva.onlinejudge.org/external/117/11727.pdf
#include <stdio.h>

int main() {
  int input[3];
  int i, j, k, temp, n = 0;
  scanf("%d",&n);
  for(k=0; k < n; k++) {
    scanf("%d %d %d", &input[0], &input[1], &input[2]);
      for(i=0; i < 3; i++) {
        for(j=i+1; j < 3; j++) {
          if(input[i] > input[j]) {
            temp = input[i];
            input[i] = input[j];
            input[j] = temp;
          }
        }
      }
    printf("Case %d: %d\n", k+1, input[1]);
  }
  return 0;
}
