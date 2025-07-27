class Solution {
    public int countHillValley(int[] nums) {
        int l = 0, r = 0;
        int cur = 0;
        int hill = 0, valley = 0;

        while (cur < nums.length - 1) {
            cur++;

            
            while (cur < nums.length && nums[cur] == nums[cur - 1]) {
                cur++;
            }

            if (cur >= nums.length - 1) break;

           
            if (r <= cur) {
                r = cur + 1;
                while (r < nums.length && nums[r] == nums[cur]) {
                    r++;
                }
                if (r >= nums.length) return hill + valley;
            }


            while (l < cur && nums[l + 1] != nums[cur]) {
                l++;
            }

            if (nums[cur] > Math.max(nums[l], nums[r])) {
                hill++;
            } else if (nums[cur] < Math.min(nums[l], nums[r])) {
                valley++;
            }
        }

        return hill + valley;
    }
}