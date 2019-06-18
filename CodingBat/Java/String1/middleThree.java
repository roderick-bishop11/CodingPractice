/*
Given a string of odd length, return the string length 3 from its middle,
 so "Candy" yields "and". The string length will be at least 3.
 */
 
 public String middleThree(String str) {
  int middle = str.length()/2;
  int left = middle-1;
  int right = middle+2;
  if(str.length() == 3) return str;
  return str.substring(left, middle) + str.substring(middle,right);
}
