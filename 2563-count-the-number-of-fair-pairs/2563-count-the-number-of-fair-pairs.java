import java.util.Arrays;

class Solution {
    public int countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums); // Sort the array
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            int lowerIndex = binarySearch(nums, i + 1, nums.length - 1, lower - nums[i], true);
            int upperIndex = binarySearch(nums, i + 1, nums.length - 1, upper - nums[i], false);

            if (lowerIndex != -1 && upperIndex != -1 && lowerIndex <= upperIndex) {
                count += (upperIndex - lowerIndex + 1);
            }
        }
        
        return count;
    }
    
    private int binarySearch(int[] nums, int start, int end, int target, boolean findLowerBound) {
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((findLowerBound && nums[mid] >= target) || (!findLowerBound && nums[mid] <= target)) {
                result = mid;
                if (findLowerBound) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (findLowerBound) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return result;
    }
}