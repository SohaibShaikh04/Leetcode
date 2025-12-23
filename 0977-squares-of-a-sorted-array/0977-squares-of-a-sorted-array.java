class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0 ;
        int[] ans = new int[nums.length];
        int end = nums.length - 1;
        int k = nums.length - 1;

        while(start <= end) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[k] = Math.abs(nums[start])*Math.abs(nums[start]);
                start++;
            }
            else {
                ans[k] = Math.abs(nums[end])* Math.abs(nums[end]);
                end--;
            }
            k--;
        }
        return ans;
    }
}



//Solved using two pointer approach 