public String zipZap(String str) {
  if(str.length()<3) return str;
  StringBuilder s = new StringBuilder();
  for(int i = 0; i< str.length() -2; i++){
    s.append(str.charAt(i));
    if(str.substring(i, i+3).matches("z.p")){
      s.append(str.charAt(i+2));
      i = i+2; //skips ahead
    }
    if(i == str.length()-3) s.append(str.substring(i+1)); 
  }
  return s.toString();
}