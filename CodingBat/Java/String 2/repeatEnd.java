public String repeatEnd(String str, int n) {
  String endStr = "";
  
  for(int i = 0; i < n; i++){
    endStr+= str.substring(str.length()-n);
  }
  return endStr;
}
