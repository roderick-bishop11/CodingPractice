public int[] front11(int[] a, int[] b) {
  int [] nums = new int [1];
  int [] nums2 = new int[2];
  if(a.length >=1 && b.length >= 1){
    nums2[0] = a[0];
    nums2[1] = b[0];
    return nums2;
  }
  if(a.length >= 1 && b.length < 1) nums[0] = a[0];
  if(b.length >= 1 && a.length < 1) nums[0] = b[0];
  if(a.length == 0 && b.length == 0) return new int [0];
  return nums;
}
