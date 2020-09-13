public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] sol = new String[n];
  int acount = 0, bcount = 0;
  for(int i = 0; i < n; i++){
    if(a[acount].compareTo(b[bcount]) == 0 && bcount != n-1){
      bcount++;
    }
   if(a[acount].compareTo(b[bcount]) < 0 ) {
     sol[i] = a[acount];
     acount++;
   }  
   else{
     sol[i] = b[bcount];
     bcount++;
   }
  }
  return sol;
}
