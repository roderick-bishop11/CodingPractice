public int strCount(String str, String sub) {
  int count = 0;
  if(str.length() < sub.length()) return count; //sub.length
  if(str.substring(0,sub.length()).equals(sub)){ // sub.length()
    count++;
    if(sub.length() > 1 && sub.charAt(0) == sub.charAt(1)) return count + strCount(str.substring(2),sub);
    return count + strCount(str.substring(1),sub);
  }
  return count + strCount(str.substring(1),sub);
}
