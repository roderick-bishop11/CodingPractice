public int loneSum(int a, int b, int c) {
  if(a!= b && a!=c && b!=c){
    return a+b+c;
  }
  if(a == b && a!=c){
    return c;
  }
  if(a == c && a!=b){
   return b;
  }
  
  if(c==b && c!=a){
    return a;
  }
  return 0;  
}
