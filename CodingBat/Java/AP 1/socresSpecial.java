public int scoresSpecial(int[] a, int[] b) {
  return findScore(a) + findScore(b);
}

public int findScore(int[] arr){
  int special=0;
  for (int i=0; i< arr.length; i++){
    if(arr[i]%10==0 && arr[i]>special ){
      special=arr[i];
    }
    
  }
  return special; 
}
