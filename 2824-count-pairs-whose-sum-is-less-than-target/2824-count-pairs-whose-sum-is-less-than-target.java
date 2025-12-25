class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int start = 0;
        int end = nums.size() - 1;
        int count = 0;
        Collections.sort(nums);
        while(start<end)
        {
            
                if(nums.get(start) + nums.get(end) < target)
                {
                    count +=  end - start; //incrementing count when condition matches
                    start++;
                }
                else{
                    end--;
                }
            
        }
        return count;
    }
}