public String stringSplosion(String str) {
  String newStr = "";
  for(int i = 0; i < str.length(); i++){
    newStr +=str.substring(0,i);//as i increments, the # of chars will go up
  }
  return newStr+str;
}
