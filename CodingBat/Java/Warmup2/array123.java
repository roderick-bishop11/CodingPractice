public boolean array123(int[] nums) {
//for loop
  for(int i = 0; i < nums.length-2; i++){
    //condition to return true
    if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
      return true;
    }
    if(nums[i] == 2 && nums[i+1] ==1 && nums[i+2] == 3){
      return true;
    }
    if(nums[i] == 2 && nums[i+1] == 3 && nums[i+2] == 1){
      return true;
    }
    if(nums[i] == 3 && nums[i+1] ==  2 && nums[i+2] == 1){
      return true;
    }
  }
  return false;
}