class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
     ArrayList<String> ans = new ArrayList<String>();
     int[] freq2 = new int[26];
     for(String word:words2){
        int []temp = new int[26];
        for(char ch : word.toCharArray()){
            temp[ch-'a']++;
            freq2[ch-'a'] = Math.max(freq2[ch-'a'], temp[ch-'a']);
        }
    }
    for(String word : words1){
        int[] temp = new int[26];
        for(char ch : word.toCharArray()){
            temp[ch-'a']++;
        }
        if(isSubset(freq2,temp)){
            ans.add(word);
        }
    }
    return ans;
    }
private boolean isSubset(int[] freq2 , int[] temp){
    for(int i=0;i<26;i++){
        if(temp[i]<freq2[i]){
            return false;
        }
    }
    return true;
}
}