/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.
*/

public boolean parrotTrouble(boolean talking, int hour) {
  return (talking==true && hour<7 || talking==true && hour>20)? true:false;
}

/* 
you don't need the ternary statement,but it looks cool.
You could just use everything in the return before the ? operator
*/
