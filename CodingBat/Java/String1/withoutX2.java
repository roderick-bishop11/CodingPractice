/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 
'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
*/

public String withoutX2(String str) {
  if(str.length()<1) return str;
  if(str.length()>=2 && str.substring(1,2).equals("x")) str = str.substring(0,1) + str.substring(2);
  if(str.length()>2 && str.startsWith("xx")) str = str.substring(2);
  if(str.substring(0,1).equals("x")) str = str.substring(1);
  return str;
}