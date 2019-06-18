/*
Given a string and a second "word" string, we'll say that the word matches the string 
if it appears at the front of the string, except its first char does not need to match exactly. 
On a match, return the front of the string, or otherwise return the empty string. So, so with the 
string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
*/

public String startWord(String str, String word) {
  if(word.length()>str.length()) return "";
  //if a sub of str with index 1-length of word equals sub of word starting from 1
  if(str.substring(1,word.length()).equals(word.substring(1))) return str.substring(0,word.length());
  return "";
}