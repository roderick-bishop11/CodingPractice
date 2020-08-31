public String noX(String str) {
  if(str.length() == 0) return str; // base case
  if(str.charAt(0) == 'x'){
    return "" + noX(str.substring(1)); // case if there is an x
  }
  return str.charAt(0) + noX(str.substring(1));
}
