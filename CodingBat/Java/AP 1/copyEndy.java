public int[] copyEndy(int[] nums, int count) {
  int [] newArr = new int [count];
  int index = 0;
  for(int i = 0; i < nums.length; i++){
    if(isEndy(nums[i])){
      newArr[index] = nums[i];
      index++;
    }
    if(index == count) return newArr;
  }
  return newArr;
}

public boolean isEndy(int n){
  if(n >= 0 && n <= 10 || n >= 90 && n <= 100 ){
    return true;
  } 
  return false;
}
