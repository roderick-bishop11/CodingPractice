/*

Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, then return true only if both are negative.

*/
public boolean posNeg(int a, int b, boolean negative) {
if(negative) {
  if(a<0&&b<0)return true;
  return false;
}
if(a>0 && b<0 || a<0 && b>0) return true;
return false;
}
