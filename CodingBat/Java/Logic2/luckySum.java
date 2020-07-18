public int luckySum(int a, int b, int c) {
  int [] nums = new int [] {a, b, c};
  int sum = 0; 
  for(int i:nums){
    if(i == 13) break;
    sum+=i;
  }
  return sum;
}
