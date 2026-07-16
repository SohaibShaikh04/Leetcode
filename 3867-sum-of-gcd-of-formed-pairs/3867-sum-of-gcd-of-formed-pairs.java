class Solution {

    int gcd(int x , int y){
        if(y==0) return x;
        return gcd(y, x%y);
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int mx = 0;
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx , nums[i]);
            int x = nums[i];
            int y = mx;
            prefixGcd[i] = gcd(x,y);
        }

        Arrays.sort(prefixGcd);
        int n=prefixGcd.length;
        long ans = 0;
        // this method actually helps me skipping the odd case as well wonder I did'nt thought this beofre : ( - sohaib you're dumb!
        for(int i=0;i<n/2;i++) 
        {
          ans += gcd(prefixGcd[i], prefixGcd[n-i-1]);
        }
        return ans;
    }
}