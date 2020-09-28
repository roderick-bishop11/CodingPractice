class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length() % 2 != 0)return false;
       
        // create a stack of chars and then add them if there are opening opening brackets
        Stack<Character> st = new Stack<Character>(); // stack can only use wrapper classes
        
        for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            st.push(s.charAt(i)); // this adds to the stack
   
            // check for empty, and if there is a match in there
            if (s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(') 
                st.pop();
            if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{')
                st.pop();
            if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[')
               st.pop();       
        } 
 return st.isEmpty()? true: false;
}
}

           
        /*if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == '}') && !st.isEmpty())
            st.pop();
            my original train of thought doesn't account for matches, only if ther is or isn't with || logic
            */ 