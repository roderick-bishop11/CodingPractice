public String stringX(String str) {
  if(str.length() == 0) return str; //case where string is empty
  String ans = str.substring(0,1); //1st char will be in the string regardless
  for(int i = 1; i<str.length(); i++){
    if(str.charAt(i) == 'x' && i!=str.length()-1) continue;
    ans+=str.substring(i,i+1);
  }
  return ans;
}
