class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = 0 ;
        int end = 0 ;
        int k=0;
        int[] nums1_dup = nums1.clone();

        while(start < m && end < n){
            if(nums1_dup[start] <= nums2[end]){
                nums1[k++] = nums1_dup[start++];
                
            }
            else{
                nums1[k++] = nums2[end++];
              
            }
            
        }
        //remaining first array
        while(start<m){
            
            nums1[k++]=nums1_dup[start++];

        }
        //remaining second array
        while(end<n){
            
            nums1[k++] = nums2[end++];
        
        }
    }
}