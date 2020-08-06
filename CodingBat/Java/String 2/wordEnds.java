public String wordEnds(String str, String word) {
  StringBuilder s = new StringBuilder();
    int index = 0;
  for(int i = 0; i < str.length()-(word.length()-1); i++){
  if(str.substring(i, i+word.length()).equals(word)){
    if(i!= 0){
      s.append(str.charAt(i-1));
    }
    if(i+word.length() < str.length()){
      s.append(str.charAt(i+word.length()));
    }
  }
  }
  return s.toString();
}