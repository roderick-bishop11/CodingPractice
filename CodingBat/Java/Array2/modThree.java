public boolean modThree(int[] nums) {
  boolean oddStreak = false, evenStreak = false; //if we have a continued streak we add to count
  int count = 0; 
  for(int i: nums){
    if(count == 3) return true;
    if(i%2 == 0){  //even
      if(evenStreak && !oddStreak){ //if you're already on an even streak
        count++;
      }
      else{ //if you were on an odd streak or at the first number
        oddStreak = false;
        evenStreak = true;
        count = 1; //reset count to 1 because you are on a new streak
      }
    }
    else{ // odd number
      if(oddStreak && !evenStreak){
          count++;
      }
      else{
        oddStreak = true;
        evenStreak = false;
        count=1;
      }
    }
  }
  return (count == 3) ? true: false;
}


// SO HAPPY THAT I GOT THIS ON THE FIRST TRY!!!!