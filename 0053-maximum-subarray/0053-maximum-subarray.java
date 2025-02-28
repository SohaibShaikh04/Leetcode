class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubSum = nums[0];
        int maxSubSum = nums[0];
        for(int i=1;i<n;i++)  //starting from 1 because initialize the zero index earlier
        {
            currSubSum = Math.max(nums[i],currSubSum + nums[i]);
            maxSubSum = Math.max(maxSubSum,currSubSum);
        } 
        return maxSubSum;
    }
}