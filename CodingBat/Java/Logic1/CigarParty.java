public boolean cigarParty(int cigars, boolean isWeekend) {
  return((isWeekend == false && (cigars>= 40 && cigars<=60)) || (isWeekend == true && cigars>=40));
}
