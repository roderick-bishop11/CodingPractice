    static int countingValleys(int n, String s) {
        int level = 0, countValleys = 0; 
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'D') level--;
            else if(s.charAt(i) == 'U') level++;
            if(level == 0 && s.charAt(i) == 'U') countValleys++;
        }
        return countValleys;
    }