boolean doubleX(String str) {
  for(int i=0; i<str.length()-1;i++){
    if(str.substring(i,i+1).equals("x")){
    //found first x, check if followed by x
      if(str.substring(i+1,i+2).equals("x")) return true;
      else return false;
    }
  }
  //if never found an x
  return false; 
}
