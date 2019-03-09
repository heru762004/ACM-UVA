// solution for problem horror dash
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2899
#include <stdio.h>

int main() {
  int num, n, i, j, input, output;
  scanf("%d", &num);
  for(i=0; i < num; i++) {
    output = -1;
    scanf("%d", &n);
    for(j=0; j < n; j++) {
      scanf("%d", &input);
      if(output < input) output = input;
    }
    printf("Case %d: %d\n", (i+1), output);
  }
  return 0;
}
