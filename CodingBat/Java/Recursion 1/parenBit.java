public String parenBit(String str) {
  if(str.charAt(0) == ')') return str;
  
  //if they match-- base case
  if(str.charAt(0) == '(') {
    if(str.charAt(str.length()-1) == ')') return str;
    else{
      return parenBit(str.substring(0,str.length()-1)); //chop one off at the end
    }
  }
  return parenBit(str.substring(1)); //chop one off at the beginning
}

/*codingbat solution is much cleaner, I'm learning that sometimes with recursion you 
can use your recursive cases to weed out failures and only return back your base case
If you can evaluate base case last. 
*/