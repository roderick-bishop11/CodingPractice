public int array11(int[] nums, int index) {
  int count = 0;
  if(nums.length == 0 || index == nums.length) return count;
  if(nums[index] == 11) count++;
  return count + array11(nums,index+1);
}
