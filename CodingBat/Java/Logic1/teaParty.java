public int teaParty(int tea, int candy) {
  boolean dbl = false; 
  if(tea >= (candy*2) || candy >= (tea*2)){
    dbl = true;
  }
  if(candy < 5 || tea  < 5) return 0;
  return(tea >= 5 && candy >= 5 && dbl)? 2:1;
}
