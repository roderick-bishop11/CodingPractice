import java.util.*;
public class CalculateRotation {
    public static int shiftedDiff(String first, String second) {
      if(first.equals(second)) return 0;
      
      LinkedList <Character> letters = new LinkedList<Character>();
      int countShuffle = 0;
      int len = 0; 
      for(int i = 0; i < first.length(); i++){
        letters.add(first.charAt(i));
      }
      while(len < first.length()){
          char temp = letters.removeLast();
          letters.addFirst(temp); 
          countShuffle++;
          len++;
        Character[] arr = letters.toArray(new Character [second.length()]);
        if(second.equals(makeString(arr)))return countShuffle;
      }
      
        return -1;
    }
  
 public static String makeString(Character[] a){
   String str = "";
   for(int i = 0; i<a.length; i++){
     str+=a[i];
   }
   return str;
 }
}
