public boolean has271(int[] nums) {
  if(nums.length<3) return false;
  
  for(int i = 0; i < nums.length - 2; i++){
    int val = nums[i];
    if(nums[i+1] == val+5){  //the 7 check
    //the 1 check was kinda tricky because you had to compare to the correct val which was val-1
      if(Math.abs(nums[i+2] - (val-1)) <=2 && Math.abs(nums[i+2] - (val-1)) >=0)  return true; // the 1 check
    } 
    
  }
  
  return false;
}
