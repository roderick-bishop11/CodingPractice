public int countCode(String str) {
  //our window is four
  int count = 0;
  for(int i = 0; i < str.length()-3; i++){
    if(str.substring(i,i+2).equals("co") && str.charAt(i+3) =='e')count++;
  }
  return count;
}
