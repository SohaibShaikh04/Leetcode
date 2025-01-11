class Solution {
    public boolean canConstruct(String s, int k) {
    HashMap<Integer> = new HashMap<Integer>();
        if(s.length() == k){
            return true;
        }
        if(s.length() < k){
            return false;
        }

        int[] vec = new int[26];
        for(char ch : s.toCharArray()){
            vec[ch-'a']++;

        }

        int oddFreqCharCount = 0;

        for(int i=0;i<26 ; i++){
            if(vec[i]%2 != 0){
                oddFreqCharCount++
            }

        } 
        
     return oddFreqCharCount <= k;   
    }
}