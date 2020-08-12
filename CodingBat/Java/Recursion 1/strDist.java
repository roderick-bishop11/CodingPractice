public int strDist(String str, String sub) {
  
  if(str.length()<sub.length()) return 0;
  //if we have sub to start and end, else return the length of str
  if(!str.startsWith(sub)) return strDist(str.substring(1), sub); //chop one off front
  if(!str.endsWith(sub)) return strDist(str.substring(0, str.length()-1), sub); //chop one off end
  //if there is only one ocurrence of sub, then it will wittle down little by little
  return str.length();
}
