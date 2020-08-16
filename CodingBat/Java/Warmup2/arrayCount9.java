public int arrayCount9(int[] nums) {
  int count = 0;
  java.util.Arrays.sort(nums);
  for(int i = nums.length-1; i > 0; i--){
    if(nums[i] == 9) count++;
    if(nums[i] != 9) break;
  }
  return count;
}