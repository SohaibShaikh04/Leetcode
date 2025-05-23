class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minInd=0;
        int min = Integer.MAX_VALUE;
        int netProf=0;

         if(prices.length==0 || prices.length==1){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
                minInd=i;
            }
            else if(prices[i]-min > netProf){
                netProf = prices[i]-min;
            }
        }
        return netProf;
    }
}