public String doubleChar(String str) {
  String newString = "";
  int i=0, len = str.length();
  
  while(i!= len){
    //
    newString+= str.charAt(i);
    newString += str.charAt(i);
    i+=1;
  }
  return newString;
}
