// Hello World problem :
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2683

#include <stdio.h>
#include <math.h>

int main() {
  int input;
  double result;
  int temp;
  int i=0;
  int case_no = 1;
  while (scanf("%d",&input) != EOF) {
    i = 0;
    temp = -1;
    if(input < 0) break;
    while(1) {
      if(temp >= input) break;
      result = pow(2,i);
      temp = result;
      i++;
    }
    if(i-1 < 0) {
      printf("Case %d: %d\n", case_no, i);
    } else {
      printf("Case %d: %d\n", case_no, i-1);
    }
    case_no++;
  }
  return 0;
}
