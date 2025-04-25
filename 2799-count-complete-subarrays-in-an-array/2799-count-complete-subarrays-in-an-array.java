public class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int num : nums) {
            a.add(num);
        }
        int td = a.size();
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> cs = new HashSet<>();
            for (int j = i; j < n; j++) {
                cs.add(nums[j]);
                if (cs.size() == td) {
                    count += (n - j);
                    break;
                }
            }
        }
        return count;
    }
}