class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        int n = word1.length();
        int m = word2.length();
        while(i<n && j<m){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }

        while(i<n){
            ans.append(word1.charAt(i++));
        }
        while(j<m){
            ans.append(word2.charAt(j++));
        }
        
        return ans.toString();
    }
}