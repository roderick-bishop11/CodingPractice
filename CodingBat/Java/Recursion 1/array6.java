public boolean array6(int[] nums, int index) {
  if(nums.length > 0 && nums[index] == 6) return true; 
  if(index == nums.length-1 || nums.length == 0) return false; // if you make it to the end and ther is no 6
  return array6(nums,index+1);
  
}
