class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length == 1) return nums[0]; //base case


        int left = 0;
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        for(int right = 0  ; right< nums.length; right++){
            sum += nums[right];

            if( right - left + 1 == k){
                maxSum = Math.max(maxSum , sum);
                sum -= nums[left];
                left++;
            }
        }
        double maxAvg = (double) maxSum / k ; 
        return  (double) maxAvg;
    }
}