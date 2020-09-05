    public int sumDigits(int n) {
  int sum = 0; // declare sum 
  if(n/10 == 0){
      return n; // if it equals 0, then return tha number
  } 
  return n%10 + sumDigits(n/10);
  // return the sum of the digits
}
