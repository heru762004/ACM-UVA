// solution for language detection :
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=3402
#include <stdio.h>
#include <string.h>

int main() {
  int caseNo = 1;
  char input[200];
  char output[100];
  while(scanf("%s", &input)!=EOF) {
    if(strcmp(input, "#") == 0)break;
    if(strcmp(input,"HELLO") == 0) {
      strcpy(output, "ENGLISH");
    } else if(strcmp(input,"HOLA") == 0) {
      strcpy(output, "SPANISH");
    } else if(strcmp(input,"HALLO") == 0) {
      strcpy(output, "GERMAN");
    } else if(strcmp(input,"BONJOUR") == 0) {
      strcpy(output, "FRENCH");
    } else if(strcmp(input,"CIAO") == 0) {
      strcpy(output, "ITALIAN");
    } else if(strcmp(input,"ZDRAVSTVUJTE") == 0) {
      strcpy(output, "RUSSIAN");
    } else {
      strcpy(output, "UNKNOWN");
    }
    printf("Case %d: %s\n", caseNo, output);
    caseNo++;
  }
  return 0;
}
