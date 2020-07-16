public int[] makeLast(int[] nums) {
  int [] newArr = new int [2 * nums.length];  
  newArr[newArr.length-1] = nums[nums.length-1];
  return newArr;
}
