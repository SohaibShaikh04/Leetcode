class Solution {
    public int[] sortedSquares(int[] nums) {
        int start =0;
        int end = nums.length - 1;
        int[] ans = new int[nums.length];
        int k = nums.length -1 ;
        while(end >= start){

            if(Math.abs(nums[end]) > Math.abs(nums[start]) ){
                ans[k] = nums[end] * nums[end];
                end--;
            }
            else {
                ans[k] = nums[start] * nums[start];
                start++;
            }
            k--;
        }
        return ans;
    }
}