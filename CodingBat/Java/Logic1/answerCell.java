public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  boolean ans  = false;
  if(isMorning && isMom && !isAsleep) ans = true; //if its the morning and you aren't asleep
  if(!isMorning && !isAsleep) ans = true;// if its not morning and your're awake
  return ans; // any other time
}
