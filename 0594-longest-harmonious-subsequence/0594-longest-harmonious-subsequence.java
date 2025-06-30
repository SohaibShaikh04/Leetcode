public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int max = 0;
        
        for (int i=0; i<nums.length;i++) {
            while (nums[i] - nums[j]>1) {
                j++;
            }
            if (nums[i] - nums[j] == 1) {
                max = Math.max(max, i - j + 1);
            }
        }
        return max;
    }
}


//Sliding window best option and array ko sort karne se easier hojaaega to find