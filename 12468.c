// Zapping UVA Problem :
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3912

#include <stdio.h>


int main()
{
    int a,b;
    while (scanf("%d %d",&a,&b) == 2) {
      if (a == -1 && b == -1) break;
      if (a < b){
        int c = b - a;
        int d = 100 + a;
        int e = d - b;
        if(c > e) {
          printf("%d\n",e);
        } else {
          printf("%d\n",c);
        }
      } else {
        int c = a - b;
        int d = 100 + b;
        int e = d - a;
        if(c > e) {
          printf("%d\n",e);
        } else {
          printf("%d\n",c);
        }
      }
    }
    return 0;
}
