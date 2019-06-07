/*

Given 2 int values, return true if either of them is in the range 10..20 inclusive.

*/

public boolean in1020(int a, int b) {
  return (a<=20 && a>=10) || (b >= 10 && b <= 20);
}
