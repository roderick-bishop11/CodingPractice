public int[] swapEnds(int[] nums) {
int num = nums[0];
nums[0] = nums[nums.length-1];
nums[nums.length-1] = num;
return nums;
}
