public boolean has77(int[] nums) {
  for(int i=1; i<nums.length-1; i++) {
    if(nums[i]==7 && nums[i+1]== 7){
      return true;
    }
    else if(nums[i]==7&& nums[i-1]==7){
      return true;
    }
    else if(nums[i-1]==7 && nums[i+1]==7){
      return true;
    }
  }
  return false; 
}
