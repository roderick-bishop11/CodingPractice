public int roundSum(int a, int b, int c) {
 int sum = 0;
  sum+=round10(a);
  sum+=round10(b);
  sum+=round10(c);
  return sum;
}

public int round10(int a){
  if(a%10 >=5){
    a = a/10;
    a+=1;
    a=a*10;
  }
  else{
    a = (a/10);
    if(a == 0) return a;
    else{
      a = a*10;
    }
  }
  return a;
}
