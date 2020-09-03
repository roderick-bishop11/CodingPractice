public int[] post4(int[] nums) {
  if(nums.length > 1){
    for(int i = nums.length-1; i >= 0; i--){
      if(nums[i] == 4) return subArray(nums,i+1);
    }
  }
  return new int[0];
}

public int[] subArray(int[] arr, int index){
  int j = 0;
  int [] arr2 = new int[arr.length-index];
  for(int i = index; i < arr.length; i++){
    arr2[j] = arr[i];
    j++;
  }
  return arr2;
}

/* Approach: go from the back of the array, if there is a 4 then it is the last one. That makes the best Ω(n-m) + Ω(m) where m is the index of the last 4 and the added
Ω(m) is because you have to add m elements to the new array. Worst case is O(n)

Space: I believe the space is O(1) because we are making a single array. 

*/