#include <stdio.h>
#include <string.h>

int main() {
  char input[200];
  char in1[50];
  char in2[50];
  char result[50];
  int numCorrect = 0;
  int p = 0;
  int q = 0;
  int mode = 1;
  int r = 0;
  int operator = 0;
  int i = 0;
  while (scanf("%s",&input) != EOF) {
    p = 0;
    q = 0;
    mode = 1;
    r = 0;
    operator = 0;
    for(i=0; i < strlen(input); i++) {
      if(mode < 3 && (input[i] == '=' || input[i] == '-' || input[i] == '+')) {
        if(input[i] == '-' || input[i] == '+') {
          if(input[i] == '+') {
            operator = 1;
          } else if(input[i] == '-') {
            operator = 2;
          }
          mode = 2;
        } else {
          mode = 3;
        }
      } else {
        if(mode == 1) {
          in1[p++] = input[i];
        } else if(mode == 2) {
          in2[q++] = input[i];
        } else if(mode == 3) {
          result[r++] = input[i];
        }
      }
    }
    if(result[0] != '?') {
      int s = 0;
      sscanf(in1, "%d", &s);
      int t = 0;
      sscanf(in2, "%d", &t);
      int u = 0;
      sscanf(result, "%d", &u);
      if(operator == 1) {
        int res = s + t;
        if(res == u) {
          numCorrect++;
        }
      } else if(operator == 2) {
        int res = s - t;
        if(res == u) {
          numCorrect++;
        }
      }
    }
    memset(input, '\0', 200);
    memset(in1, '\0', 200);
    memset(in2, '\0', 200);
    memset(result, '\0', 200);
  }
  printf("%d\n", numCorrect);
  return 0;
}
