public boolean squirrelPlay(int temp, boolean isSummer) {
  int lim = 90;
  if(isSummer) lim = 100;
  return (temp>=60 && temp<=lim);
}
