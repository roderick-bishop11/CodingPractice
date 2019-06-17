/*
Given a string, return true if it ends in "ly".
*/

public boolean endsLy(String str) {
 return (str.length()>1 && str.substring(str.length()-2).equals("ly"))? true:false;
}