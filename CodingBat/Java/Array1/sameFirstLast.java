public boolean sameFirstLast(int[] nums) {
  int len = nums.length-1;
  return(len >= 0  && nums[0] == nums[len]); 
}
