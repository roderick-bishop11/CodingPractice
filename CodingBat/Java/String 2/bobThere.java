public boolean bobThere(String str) {
  for(int i = 0; i < str.length()-2;i++){
    if(str.substring(i,i+3).matches("b.b")) return true;
  }
  return false;
}

/*originally thought of doing this using substrings but I thought regex would
be dope. Turns out, .contains only compares literals, but .matches can be used 
with regex. Pretty SLICK
*/
