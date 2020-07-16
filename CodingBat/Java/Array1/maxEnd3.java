public int[] maxEnd3(int[] nums) {
  int large = Math.max(nums[0], nums[2]);
  return new int[] {large, large, large};
}
