public int countHi2(String str) {
  int count = 0;
  if(str.length() <= 1) return count;
/*  if(str.charAt(0) == 'x') return count + countHi2(str.substring(3));
  if(str.substring(0,2).equals("hi")){
    count++; 
    return count + countHi2(str.substring(1));
  }*/
  if(str.length() > 2 && str.substring(0,3).equals("xhi")) return count + countHi2(str.substring(3));
  if(str.substring(0,2).equals("hi")){
    count++;
    return count + countHi2(str.substring(2));
  }
  return count + countHi2(str.substring(1));
}
