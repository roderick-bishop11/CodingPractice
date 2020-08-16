public String altPairs(String str) {
  String newStr = "";
  if(str.length() == 1) return str.substring(0);
  for(int i = 0; i < str.length(); i+=4){
    if((i+2) > str.length()){
      newStr += str.substring(i, str.length());
      break;
    }
    newStr += str.substring(i,i+2);
  }
  return newStr;
}
