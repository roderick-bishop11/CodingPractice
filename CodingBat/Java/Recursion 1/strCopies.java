public boolean strCopies(String str, String sub, int n) {
  if(str.length() == 0) return false; //no chars, no sub
    if(n==0) return true; //if there are none left
    if(str.contains(sub) == true) {
      int index = str.indexOf(sub);
      return strCopies(str.substring(index+1),sub,n-1); //move to index+1
    }
    return strCopies(str.substring(1),sub,n);
}