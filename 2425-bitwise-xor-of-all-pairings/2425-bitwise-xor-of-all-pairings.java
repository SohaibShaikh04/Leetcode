class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor = 0; 

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                xor ^= (nums1[i] ^ nums2[j]); 
            }
        }
        
        return xor; 
    }
}
