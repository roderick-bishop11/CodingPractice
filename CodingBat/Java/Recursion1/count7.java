public int count7(int n) {
  int count = 0; // count;
  if(n%10 == 7 || n == 7)count+=1; // if it is 7 add to count;
  if(n/10 == 0) return count;
  return count + count7(n/10);
}
