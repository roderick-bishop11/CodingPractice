public boolean love6(int a, int b) {
  int sum = a+b;
  int minus = a-b;
  return(a == 6 || b == 6 || Math.abs(minus) == 6 || sum == 6);
}
