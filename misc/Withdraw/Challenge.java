public class Challenge {
  
  
  public static int[] withdraw(int amount) {
    
    int count = 0, a = 0, b = 0, c = 0; 
    
    while(amount > 0){
      if(amount>=100 && ((amount-100)%50 == 0 || amount-100%20 == 0)){ //if amount is greater than 100 but also divisible by 20 or 50
        if(amount == 100){
          a+=1;
          break; //last 100, break out of the loop
        }
        amount-=100;
        a++; //else we can safely shave 100 off
      }
      else if(amount>=50 && (amount-50) % 20 == 0){ //if it's greater than 50 but also doesn't leave us with indivisible amounts then we can chop a 50 off
        if(amount == 50){
          b+=1;
          break;//last 50 break out of the loop
        }
        amount-=50;
        b++; //else shave a 50 off
      }
      else if(amount>= 20){
        if(amount == 20){
          c+=1;
          break;
        }
        amount -=20;
        c++;
      } 
    }
    return new int [] {a, b, c};
  } 
}
