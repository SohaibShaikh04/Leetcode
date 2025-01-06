class Solution {
    public int[] minOperations(String boxes) {
       int n= boxes.length();
       int[] ans = new int[n];
       HashSet<Integer> h = new HashSet<Integer>();
       for(int i=0;i<n;i++){
        if(boxes.charAt(i)=='1'){
            h.add(i);
        }
       }
       for(int i=0;i<n;i++){
        for(int x:h){
            ans[i]+= Math.abs(x-i);
        }
       }  
       return ans;    
    }
}