class Solution {
    public int repeatedNTimes(int[] nums) {
      HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int n = nums.length / 2;
        for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i]) == n){
                return nums[i];
            }
        }
        return -1;
    }
}