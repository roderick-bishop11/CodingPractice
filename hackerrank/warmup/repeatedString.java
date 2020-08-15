      static long repeatedString(String s, long n) {
        long aInS = occurrences(s);
        long numCopies = n/s.length(); 
        long leftOver = n%s.length();
        long lastChars = occurrences(s.substring(0, (int)leftOver));
        return  aInS * numCopies + lastChars;
    }

    //helper 
    static long occurrences(String s){
        long count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') count++;
        }
        return count;
    }

    //Runs in n + n == 2n-> (O)n time, constant space. 