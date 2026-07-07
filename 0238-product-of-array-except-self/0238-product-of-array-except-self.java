class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        int zeroIdx = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIdx = i;
            }
            else{
                prod *= nums[i];
            }
        }
        int[] ans = new int[nums.length];

        if(zeroCount == 0){
            for(int i=0;i<nums.length;i++){
                ans[i] = prod / nums[i] ;
            }
        }
        else if(zeroCount == 1 ){
            ans[zeroIdx] = prod;
        }

        return ans;
    }
}