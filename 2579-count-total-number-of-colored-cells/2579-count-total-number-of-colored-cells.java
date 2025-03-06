class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        long increment = 0;
        
        for(int i=1;i<=n;i++){
            ans += increment;
            increment += 4;
        }

        return ans;
    }
}