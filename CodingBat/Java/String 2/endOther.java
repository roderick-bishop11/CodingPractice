public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  
  if(a.length()>=b.length() && a.substring(a.length()-b.length()).contains(b)) return true;
  if(b.length()>=a.length() && b.substring(b.length()-a.length()).contains(a)) return true;

  return false;
}
