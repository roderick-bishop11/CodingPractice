public boolean closeFar(int a, int b, int c) {

if(Math.abs(a-b) <=1){ // b is close, then c shoudl be far to return true
  if(Math.abs(c-a) >=2 && Math.abs(c-b) >=2){
    return true;
  }
}
else if(Math.abs(a-c) <=1){ // c is close, then b shoudl be far to return true
  if(Math.abs(b-a) >=2 && Math.abs(c-b) >=2){
    return true;
  }
}
return false;
}
