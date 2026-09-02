class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];

        if(nums1.length == 1) return true;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                nums2[i] = nums1[i];
                if(i != j){
                    if(nums2[i] == nums1[i] || nums2[i] == nums1[i] - nums1[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
// ab kar liya bhai o(n^2) se --Sohaib