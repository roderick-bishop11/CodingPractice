class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){ //prev # > current #
                count++;
                //checks if nums[i-2] <= nums[i]
                if(i == 1 || nums[i-2] <= nums[i]){
                    //actually perform a copy where i-i = 1
                    nums[i-1] = nums[i];
            }
              else{
                nums[i] = nums[i-1];
            }  
        }
            
    }
        System.out.println(Arrays.toString(nums));
         return (count<=1);
}
}

/*example run through:
given: [4,2,1]
for i = 1, nums[i-1] < nums[i] and we copy to make [2,2,1] count 1

for i = 2 , nums[i-1] > nums[i]. Also, nums[i-2](2) > nums[i](1) so we copy nums[i-1](2) into nums[i](i) making [2,2,2]
count 2

*/