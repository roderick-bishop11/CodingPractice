public int[] makeMiddle(int[] nums) {
  int len = nums.length/2;
  if(nums.length==2) return nums;
  return new int[] {nums[len-1], nums[len]};
}
