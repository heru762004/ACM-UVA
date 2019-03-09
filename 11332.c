// Problem Summing Digits :
// https://uva.onlinejudge.org/external/113/11332.pdf
#include <stdio.h>
#include <string.h>

int sumAllDigits(char input[200]) {
  int i=0;
  int sum=0;
  for(i=0; i<strlen(input); i++) {
    int x = input[i] - '0';
    sum += x;
  }
  return sum;
}

int main() {
  char input[200], temp[200];
  int k;
  while(scanf("%s",&input)!=EOF) {
    if(strcmp(input, "0") == 0) {
      break;
    }
    strcpy(temp, input);
    do {
      k = sumAllDigits(temp);
      memset(temp, '\0', 200);
      sprintf(temp, "%d", k);
    } while (strlen(temp) > 1);
    printf("%d\n", k);
  }
  return 0;
}
