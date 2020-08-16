public int stringMatch(String a, String b) {
int count = 0;
int length = Math.min(a.length(), b.length());
// find out which string is shorter. It limits the number of times you can iterate

//for loop, you got this part right
for(int i = 0; i<length-1; i++){
  //compare the new substring of a to b two chars at a time- YOU GOT THIS RIGHT
  String sub = a.substring(i,i+2); // gotta make a substring for both, know that next time
  String sub2 = b.substring(i,i+2);
  if(sub.equals(sub2)){
    count++;
  }
}
return count;
}
