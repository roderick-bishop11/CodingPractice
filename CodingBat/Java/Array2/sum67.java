public int sum67(int[] nums) {
  boolean flag = false;
  int sum = 0;
  for(int i: nums){
    if(i == 6 && flag == false) flag = true;
    else if(i == 7 && flag == true) flag = false;
    else if(flag == true) continue;
    else{
      sum+=i;
    }
  }
  return sum;
}
