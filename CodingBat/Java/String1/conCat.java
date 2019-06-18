/*
Given two strings, append them together (known as "concatenation") and return the result.
 However, if the concatenation creates a double-char,
 then omit one of the chars, so "abc" and "cat" yields "abcat".
*/

public String conCat(String a, String b) {
  if((a.length()>0  && b.length()>0) && (a.charAt(a.length()-1) == b.charAt(0))){
   return a.substring(0,a.length()-1).concat(b);
 } 
 
  return a+b;
}
