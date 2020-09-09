public int scoresAverage(int[] scores) {
  int half = scores.length/2;
  int avg1 = average(scores, 0, half);
  int avg2 = average(scores, half, scores.length);
 
  return Math.max(avg1, avg2);
}

int average(int[] scores, int start, int end){
  int sum = 0;
  for(int i = start; i < end; i++){
    sum += scores[i];
  }
  return sum/(scores.length/2);
}
