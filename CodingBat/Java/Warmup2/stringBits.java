public String stringBits(String str) {
  String newString="";
  for(int i=0; i<str.length(); i+=2){
    newString+=str.substring(i,i+1);
}
  return newString;
}
