class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        int prefixCnt = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        
        long cnt = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums.get(i) % modulo == k) {
                prefixCnt++;
            }
            int expectedPrefix = (prefixCnt - k + modulo) % modulo;
            cnt += freq.getOrDefault(expectedPrefix, 0);
            freq.put(prefixCnt % modulo, freq.getOrDefault(prefixCnt % modulo, 0) + 1);
        }
        
        return cnt;
    }
}