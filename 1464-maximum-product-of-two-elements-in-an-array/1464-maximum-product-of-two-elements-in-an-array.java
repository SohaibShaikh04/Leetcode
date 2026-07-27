class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE ;
        int largeIdx=0;
        for(int i=0;i<n;i++){
            if(nums[i] > largest){
                largest = nums[i];
                largeIdx = i;
            }
        }

        for(int i =0;i<n;i++){
             if(nums[i] > secondLargest && secondLargest <= largest && i != largeIdx ){
                secondLargest = nums[i];
            }
        }

        int prod =  (largest - 1) * (secondLargest - 1);
        
       return prod;
    }
}

// Previous waala approach was o(n^2) sorting karne ke wajah se this one is just basic largest and second largest ;) sohaib..