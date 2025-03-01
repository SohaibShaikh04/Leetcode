class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] temp = new int[n]; //creating a temp array to shift all the zeros
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }

        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp[j++]=nums[i];
            }
        }
        while(j<n){
            temp[j++]=0;
        }

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}