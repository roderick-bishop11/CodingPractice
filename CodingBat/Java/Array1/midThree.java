public int[] midThree(int[] nums) {
  int len = nums.length/2;
  return new int[] {nums[len-1], nums[len], nums[len+1]};
}
