class Solution {
    public int countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0, left = 0, maxFound = 0, n = nums.length;

        for (int right = 0; right < n; right++) {
            if (nums[right] == max) maxFound++;

            while (maxFound == k) {
                count += n - right;
                if (nums[left] == max) maxFound--;
                left++;
            }
        }

        return count;
    }
}