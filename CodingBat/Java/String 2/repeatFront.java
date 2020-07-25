public String repeatFront(String str, int n) {
  StringBuilder ans = new StringBuilder();
  if(n > str.length()) return str;
  for(int i = 0; i < n; i++){
    ans.append(str.substring(0,n-i));
  }
  return ans.toString();
}
