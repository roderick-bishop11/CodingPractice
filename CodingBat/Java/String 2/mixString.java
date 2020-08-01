public String mixString(String a, String b) {
  StringBuilder newStr = new StringBuilder();
  
  //not about finding out which one was shorter... but which one was longer
  int longer = (a.length()>b.length())? a.length(): b.length();
  
  for(int i = 0; i< longer; i++){
    if(i<a.length()){
      newStr.append(a.charAt(i));
    }
    if(i<b.length()){
      newStr.append(b.charAt(i));
    }
  }
  return newStr.toString();
}
