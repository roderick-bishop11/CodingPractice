public boolean dividesSelf(int n) {
 int mod = n%10;
 int original = n;
 if(mod==0) return false;
 while(n != 0){
   if(original %( n%10) != 0){
     return false;
   }
   n/= 10;
 }
 return true;
}
