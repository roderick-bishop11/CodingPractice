public String frontTimes(String str, int n) {
// could also do this with indexes and not strings
String sub = (str.length()<3)? str: str.substring(0,3);
String newString = "";
for(int i = 0; i < n; i++){
  newString+=sub;
}
  
  //iterate n times to add the string
  
  return newString;
}
