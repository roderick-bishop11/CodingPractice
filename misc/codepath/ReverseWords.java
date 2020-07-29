import java.util.Arrays;



/*Write a method reverse() that takes a message as an array of characters and reverses the order of the words in place.
*/
class ReverseWords {
  public static void main(String[] args) {
    char [] a = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
    char [] b = {'C', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n' , 'd', ' ', 's', 't', 'e', 'a', 'l'};
    char [] c = {'w', 'o', 'r', 'k','?', ' ','e', 'v', 'e', 'n', ' ', 't', 'h', 'i', 's', ' ', 'd', 'o', 'e', 's' };
    processChar(a);
    processChar(b);
    processChar(c);
    
  }

public static void processChar(char [] a){
  //send it entire char array, 
  int start = 0; 
  int end = 0; 
  a = reverse(a, 0, a.length-1);
  for(int i = 0; i < a.length-1; i++){
    if(a[i+1] == ' '){ //send that to reverse if next is empty
      end = i; 
      a = reverse(a, start, end); //reverse the word from start to end 
      start = i+2;
    } 
  } 
    end = a.length-1; //reverse the last word
    a = reverse(a, start, end);
System.out.println("final words "+ Arrays.toString(a));
}

public static char[] reverse(char[] a, int start, int end){
  for(int i = start; i < end; i++){
    char temp  = a[end];
      a[end] = a[start];
      a[start] = temp; 
      start++;
      end--;
  }
  return a;
}


}