/*

Given three int values, a b c, return the largest.

*/

public int intMax(int a, int b, int c) {
  int max=0;
  
if(a>b&&a>c) {
  max=a;
}
else if(b>a&&b>c) {
  max=b;
}
else {max=c;}

return max;

}
s