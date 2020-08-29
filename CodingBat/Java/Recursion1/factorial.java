public int factorial(int n) {
  int factorial = 1;
  if(n == 1) return factorial;
 
  return n* factorial(n-1);
}
