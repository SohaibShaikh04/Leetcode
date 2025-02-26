class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n= nums.length;
        int MaxSum=nums[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(Math.abs(sum) > MaxSum){
                     MaxSum=Math.abs(sum);
                }
            }
        }
        return MaxSum;
    }
}