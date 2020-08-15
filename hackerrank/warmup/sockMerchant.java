  static int sockMerchant(int n, int[] ar) {

        if(n == 1) return 0;
        int count = 0; 
        Arrays.sort(ar);
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
                i++;
            }
        }
        return count;
    }
