public int blackjack(int a, int b) {
int diffa = Math.abs(a-21);
int diffb = Math.abs(b-21);
if(a>21 && b<=21) return b;
else if(a<=21 && b>21) return a;
else if(a<=21 && b<=21){
  if(Math.abs(21-a)<Math.abs(21-b)){
    return a;
  }
  else{
    return b;
  }
}
return 0;
}
