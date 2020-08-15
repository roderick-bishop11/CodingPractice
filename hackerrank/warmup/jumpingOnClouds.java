    static int jumpingOnClouds(int[] c) {
        int index = 0; 
        int numJumps = 0; 

        //decided to do a while loop because I wanted to feel cool. 
        while(index<c.length-1){
            //if you can jump 2, then jump 2
            if(index+2 < c.length && c[index+2] == 0){
                numJumps++;
                index+=2;
            }
            else{
                //else... jump 1, if you can
                if(c[index+1] != 1){
                numJumps++;
                index+=1;
                }
                else{
                    return numJumps; //if you get to a spot where you can't jump 1 or 2...you're done. 
                }
            }

        }
        return numJumps;
    }