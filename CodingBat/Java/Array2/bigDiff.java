public int bigDiff(int[] nums) {
  int min = nums[0], max = nums[0];
  for(int i : nums){
    min = Math.min(min,i);
    max = Math.max(max,i);
  }
  return max-min;
}
