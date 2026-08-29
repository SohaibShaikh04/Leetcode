class Solution {


    int gcd(int x , int y){
        if(y==0) return x;

        return gcd(y , (x%y));
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums); // sorting to get the smallest and the largest number
        int x = nums[0];
        int y = nums[nums.length-1];
        return gcd(x , y );
    }
}