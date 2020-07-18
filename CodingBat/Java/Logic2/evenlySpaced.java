public boolean evenlySpaced(int a, int b, int c) {
  int [] nums = new int [] {a, b, c};
  java.util.Arrays.sort(nums);
  if(Math.abs(nums[1] - nums[0]) == Math.abs(nums[1]- nums[2])) return true; 
  
  return false;
}
