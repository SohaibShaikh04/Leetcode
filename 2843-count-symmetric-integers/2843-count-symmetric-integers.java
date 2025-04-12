class Solution {
    public int countSymmetricIntegers(int low, int high) {
         int count = 0;

        for(int num = low ; num<high+1;num++){
            String s = Integer.toString(num);
            int len = s.length();
            if(len % 2 != 0 ) continue;
            int mid = len/2;
            int leftSum=0 , rightSum = 0;
           
            for(int j=0;j<mid;j++){
                leftSum+=s.charAt(j) - '0';
                rightSum+=  s.charAt(j + mid) - '0';
            }
            if(leftSum == rightSum){
                count++;
            }  
        }
        return count;
    }
}