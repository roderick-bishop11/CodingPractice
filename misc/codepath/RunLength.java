class RunLength {
  public static void main(String[] args) {
    System.out.println(numStuff("wwwwaaadexxxxxx"));
    System.out.println(numStuff("kkfiilleeensdd"));
  }


  public static String numStuff(String str) {
    int count = 1;
    String newStr = "";
    char current = str.charAt(0);
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i + 1) == current) {
        count++;
      } 
      else{
        newStr += current;
        newStr += count;
        current = str.charAt(i + 1);
        count = 1;
      }
    }
    newStr+=current;
    newStr+=count;
    return newStr;
  }

}