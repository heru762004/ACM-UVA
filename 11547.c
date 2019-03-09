// Solution for Automatic Answer
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2542
#include <stdio.h>
#include <string.h>

int main() {
  int num, n, i;
  char result[200];
  scanf("%d", &num);
  for(i=0; i < num; i++) {
    memset(result, '\0', 200);
    scanf("%d", &n);
    n=(((((n*567)/9)+7492)*235)/47)-498;
    sprintf(result, "%d", n);
    printf("%c\n", result[strlen(result)-2]);
  }
  return 0;
}
