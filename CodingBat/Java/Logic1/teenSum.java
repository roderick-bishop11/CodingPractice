public int teenSum(int a, int b) {
  boolean range = false;
  if(a >= 13 && a <= 19 || b >=13 && b <= 19) range = true;
  return(range)? 19:a+b;
}
