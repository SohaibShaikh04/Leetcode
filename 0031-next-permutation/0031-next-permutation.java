class Solution {

    public void reverse(int[] nums , int left , int right){
        while(right > left){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivotIndex = -1;
        //iterate backwords and find the element which is smaller then its next index find pivot 
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1]){
                pivotIndex = i;
                break;
            }
        }
        // if idx remains -1
        if(pivotIndex == -1){
            reverse(nums,0,n-1);
            return;
        }

        //once pivot is reached iterate again till pivotIndex and try to swap the element greater than the pivot index
        for(int i=n-1;i>pivotIndex;i--){
            if(nums[i] > nums[pivotIndex]){
                int temp = nums[i];
                nums[i] = nums[pivotIndex];
                nums[pivotIndex] =temp;
                break;
            }
        }
        //once swapping is done reverse the array from the pivot position
        reverse(nums , pivotIndex+1 , n-1);
        
    }
}

// Next permutation helps in understanding how to reach themax number from the probab. but it should be exact next --Sohaib ;)