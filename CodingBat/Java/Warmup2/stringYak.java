public String stringYak(String str) {
  for(int i = 0; i<=str.length()-3; i++){
    if(str.substring(i,i+3).equals("yak")){
      str = str.substring(0,i)+str.substring(i+3, str.length());
    }
  }
  return str;
}
