public int array667(int[] nums) {
  int un = 0, deux = 0, count = 0;
  for(int i = 0; i<nums.length-1; i++){
  un = nums[i];
  deux = nums[i+1];
  if(un == 6 && deux == 6 || un == 6 && deux == 7) count++;
}
  return count;
}
