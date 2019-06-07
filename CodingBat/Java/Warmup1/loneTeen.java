/*


We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.

*/

public boolean loneTeen(int a, int b) {
  boolean aIsTeen= inBounds(a);
  boolean bIsTeen = inBounds(b);
return(aIsTeen && !bIsTeen || !aIsTeen && bIsTeen);
}

public boolean inBounds(int n){
  return(n<=19 && n>=13);
}