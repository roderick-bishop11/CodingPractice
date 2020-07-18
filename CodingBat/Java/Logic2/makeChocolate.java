public int makeChocolate(int small, int big, int goal) {
  //fails right out of the gate if we don't have enough bars total or not enough small bars

  if(big*5 + small < goal )return -1;
  if(goal%5 > small) return -1;
  
 while(big>=1){
   if(goal-5<0){
     return goal; //solves for the case that we still have big but leftover less than 5
   } 
   else{
   goal = goal-5;
   big--;
 }
 }
 //now we have what is left over after using all of big; 
 return goal;
  
}
