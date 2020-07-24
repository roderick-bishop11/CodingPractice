public boolean sameStarChar(String str) {
  int countStars = 0;
  int countTrues =0;
  for(int i = 1; i < str.length()-1; i++){
    if(str.charAt(i) == '*'){
      countStars++;
      if(str.charAt(i-1) == str.charAt(i+1)){
        countTrues++;
      }
    }
  }
  return (countStars == countTrues)? true:false;
}
