public boolean sameEnds(int[] nums, int len) {
  int minus = nums.length - len; //starting index to read left from right
  
  for(int i = 0; i < len; i++, minus++){ // you can decrement/increment two variables at the same time in Java.. just like C
    if(nums[i] != nums[minus]) return false;
  }
  return true;
}