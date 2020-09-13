    public boolean scoresClump(int[] scores) {
  for(int i=1; i<scores.length-1; i++){
    if(scores[i+1]-scores[i-1]<=2) return true;
  }
  return false;
}
