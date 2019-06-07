/*


Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


*/

public int max1020(int a, int b) {
 int max;
 int other;
 if(a>b) {
   max=a;
   other=b;
 }
 else {
   max=b;
   other=a;
 }
 if(max>=10 && max<=20) return max;
 else if(other>=10&&other<=20) return other;
 return 0;
  
}

//there probably was an easier way to do this..