public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for( int i = 0; i<nums1.length; i++){
    int diff = twoOrLess(nums1[i], nums2[i]);
    if( diff <= 2 && diff != 0 ) count++;
  }
  return count;
}

public int twoOrLess( int num, int num2){
  return Math.abs(num-num2);
}
