class Solution {
    public int findLucky(int[] arr) {
      
        int luckyNum=-1;
        int n=arr.length;
        for(int i =0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==arr[i]){
               luckyNum = Math.max(luckyNum , arr[i]);
            }
        }
        return luckyNum;
    }
}


// Less effficient hai cuz bruteforce hai