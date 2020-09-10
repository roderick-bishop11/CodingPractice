public int[] copyEvens(int[] nums, int count) {
int [] answer= new int[count];
int integer=0;
for(int i=0;integer<answer.length; i++){
if(nums[i]%2==0){
   answer[integer]=nums[i];
   integer++;
}
}
return answer; 
}

