class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }

            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        int removeFront = Math.max(minIdx, maxIdx) + 1;

        int removeBack = n - Math.min(minIdx, maxIdx);

        int removeBothSides = Math.min(
            minIdx + 1 + (n - maxIdx),
            maxIdx + 1 + (n - minIdx)
        );

        return Math.min(
            removeFront,
            Math.min(removeBack, removeBothSides)
        );
    }
}

// You can either remove from front or back or from both sides the question arises with minimum number of deletions so used Math.min - Sohaib ( :