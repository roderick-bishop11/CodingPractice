/*

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.

*/

public String front22(String str) {
int take = 2;
if(take>str.length()) take = str.length();
return str.substring(0,take)+str+str.substring(0,take);
}
