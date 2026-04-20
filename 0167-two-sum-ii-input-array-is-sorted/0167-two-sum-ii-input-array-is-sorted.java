class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=numbers.length - 1;
        while(j>i){
            if(nums[i] + nums[j] == target){
                return new int[] {i,j};
            }
            else if(nums[i] + nums[j]> target) {
                j-- ;
             }
             else i++;
        }
        return new int[] {0,0};
    }
}