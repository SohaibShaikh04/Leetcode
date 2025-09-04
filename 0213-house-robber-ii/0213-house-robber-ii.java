import java.util.Arrays;

class Solution {
    public int n;

    public int rob(int[] nums) {
        n = nums.length;
        if (n == 1)
            return nums[0];

        int[] t = new int[n + 1];
        // t[i] = Max money gained from i houses

        int result1 = 0;
        int result2 = 0;

        // Case-1 (Take from 1st House - Hence skip the last house)
        t[0] = 0;
        for (int i = 1; i <= n - 1; i++) {
            t[i] = Math.max(t[i - 1], nums[i - 1] + ((i - 2 >= 0) ? t[i - 2] : 0));
        }
        result1 = t[n - 1];

        Arrays.fill(t, 0);
        // Case-2 (Take from 2nd House - Hence take the last house)
        t[0] = 0;
        t[1] = 0;
        for (int i = 2; i <= n; i++) {
            t[i] = Math.max(t[i - 1], nums[i - 1] + ((i - 2 >= 0) ? t[i - 2] : 0));
        }
        result2 = t[n];

        return Math.max(result1, result2);
    }
}