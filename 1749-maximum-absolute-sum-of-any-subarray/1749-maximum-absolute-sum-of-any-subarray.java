class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0], minSum =nums[0], currMax = nums[0], currMin = nums[0];
        int n = nums.length;
        for (int i=1 ; i<n;i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
