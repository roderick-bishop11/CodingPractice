public String repeatSeparator(String word, String sep, int count) {
  StringBuilder newStr = new StringBuilder();
  if(count == 0) return "";
  newStr.append(word);
  for(int i = 1; i<count; i++){
    newStr.append(sep);
    newStr.append(word);
  }
  return newStr.toString();
}