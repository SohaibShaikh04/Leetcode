class Solution {
    public int removeDuplicates(int[] nums) {
        int initial=0;
        int moving=initial+1;
        int diffCount=0;
        while(moving < nums.length){
            if(nums[moving] == nums[moving-1]){
                moving++;
                continue;
            }
            else{
                
                nums[initial + 1] = nums[moving];
                initial++;
                moving++;
                diffCount++;
            }
        }

    return diffCount + 1;
    }
}