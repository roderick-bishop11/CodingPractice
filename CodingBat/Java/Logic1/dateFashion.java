public int dateFashion(int you, int date) {
  if((you>=0 && you<=2)  || (date>=0 && date<=2)) return 0;
  if((you>=8 && you<=10) || (date>=8 && date<=10)) return 2;
  return 1;
}
