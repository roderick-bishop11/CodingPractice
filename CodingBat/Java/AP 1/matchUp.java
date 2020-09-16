public int matchUp(String[] a, String[] b) {
  int count = 0;
  
  for(int i = 0; i < a.length; i++){
      if(a[i].length() >= 1 && b[i].length() >= 1){
      if(isSameChar(a[i], b[i])){
        count++;
    }
    }
  }
  return count;
}

public boolean isSameChar(String a, String b){
  if(a.charAt(0) == b.charAt(0)) return true;
  return false;
}
