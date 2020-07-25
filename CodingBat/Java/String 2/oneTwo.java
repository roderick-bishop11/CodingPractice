public String oneTwo(String str) {
  StringBuilder ans = new StringBuilder(str.length());
  if(str.length() < 3) return "";
char[] arr = str.toCharArray();
for(int i = 0; i < arr.length-2; i+=3){
    ans.append(arr[i+1]);
    ans.append(arr[i+2]);
    ans.append(arr[i]);
  }
  return ans.toString();
}
