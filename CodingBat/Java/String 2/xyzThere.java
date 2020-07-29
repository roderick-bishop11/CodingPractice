public boolean xyzThere(String str) {
  if(!str.contains("xyz")) return false;
  
  for(int i = 0; i < str.length()-2; i++){
    if(str.charAt(i) == '.') i++; //skip if you're at a '.'
    else if(str.substring(i,i+3).equals("xyz")) return true;
  }
  return false;
}
