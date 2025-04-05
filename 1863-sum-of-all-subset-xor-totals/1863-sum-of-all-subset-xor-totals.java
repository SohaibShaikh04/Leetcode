class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int totalXor=0;
       for(int i=0;i < (1 << n); i++){
           int subset=0;
           for(int j=0;j<n;j++){
            if((i & (1 << j)) != 0){
                subset ^= nums[j];
            }
           }
           totalXor += subset;
       }
        return totalXor;
    }
}