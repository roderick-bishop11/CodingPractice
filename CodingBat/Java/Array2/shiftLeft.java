public int[] shiftLeft(int[] nums) {
  //I want to do this one in place so let's for loop through the array, backwards with a temp value
  if(nums.length < 1) return nums;
  int last = nums[nums.length-1]; // save last
  for(int i = nums.length-2; i > 0; i--){ //start at last -2;
  last = swap(i,last,nums);
  }
  last = swap(0,last,nums);
  nums[nums.length-1] = last;
  
  return nums;
}

//swaps the nums and then sets last to the new value at the same time
public int swap(int index, int b, int [] p){
    int temp = p[index];
    p[index] = b;
    b = temp;
    return b;
}