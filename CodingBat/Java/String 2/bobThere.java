public boolean bobThere(String str) {
  for(int i=1; i<str.length()-1; i++){
    String last=str.substring(i-1,i);
   String  next=str.substring(i+1,i+2);
    if(last.equals("b")&& next.equals("b")){
      return true;
    }
  }
  return false;
}
