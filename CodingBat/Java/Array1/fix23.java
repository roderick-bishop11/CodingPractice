public int[] fix23(int[] nums) {
  if(nums[0] == 2 && nums[1] == 3) return new int[] {nums[0], 0, nums[2]};
  if(nums[1] == 2 && nums[2] == 3) return new int[] {nums[0], nums[1], 0};
  return nums;
}
