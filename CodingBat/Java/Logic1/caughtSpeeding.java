public int caughtSpeeding(int speed, boolean isBirthday) {
  int maxSpeed = 80;
  int minSpeed = 60;
  if(isBirthday) {
    maxSpeed += 5;
    minSpeed = minSpeed+5;
  }
  if(speed>maxSpeed) return 2;
 if(speed<=minSpeed) return 0 ;
 return 1;
}
