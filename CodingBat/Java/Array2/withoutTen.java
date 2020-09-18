public int[] withoutTen(int[] nums) {
  if(nums.length == 1 && nums[0] == 10) return new int[] {0};
  int[] newArr = new int[nums.length];
  int tindex = newArr.length-1; //tenIndex->tindex lol
  int start = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 10){
      newArr[tindex] = 0;
      tindex--;
    }
    else{
      newArr[start] = nums[i];
      start++;
    }
  }
  return newArr;
}

/*this is a linear solution(time) that will simply add 0's jto teh end for every 10
but also add every element != 10 to the array. This way I circumvent the multiple zero problem
if I tried to turn 10's to zeros and swap.
*/

