public int noTeenSum(int a, int b, int c) {
  a = fixTeen(a);
  b = fixTeen(b);
  c = fixTeen(c);
  return a+b+c;
}

public int fixTeen(int n){
  if(n == 15 || n == 16) return n;
  
  if(13 == n || n == 14 || n >=17 && n<=19) return 0;
  return n;
}
