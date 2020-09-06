public boolean nestParen(String str) {
  if(str.length() == 0) return true;
  if(str.length() <= 1) return false;
  if(str.length() == 2 && str.startsWith("(") && str.endsWith(")")) return true;
  return (str.startsWith("(") && str.endsWith(")"))? nestParen(str.substring(1,str.length()-1)):false;



/* SIMPLER LOGIC  
  if(str.length() == 0) return true;
  if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') return nestParen(str.substring(1, str.length()-1));
  return false;
  */
}
