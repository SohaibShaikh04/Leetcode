class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int[128];
        int max =0 , maxL= 0, l=0;
        for(int i=0 ;i<s.length();i++){
            freq[s.charAt(i)]++;
            max = Math.max(max , freq[s.charAt(i)]);
            if((i-l+1) - max >k){
                freq[s.charAt(l)]--;
                l++;
            }
            maxL = Math.max(maxL,i-l+1);
        }
        return maxL;
    }
}