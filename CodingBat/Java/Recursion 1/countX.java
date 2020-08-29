public int countX(String str) {
  int count = 0;
  if(str.length() == 0) return count;
  if(str.length() == 1 && str.startsWith("x")) count+=1;
  if(str.length() >= 2 && str.substring(str.length()-2,str.length()-1).equals("x")) count+=1;
  return count + countX(str.substring(0, str.length()-1));
}
