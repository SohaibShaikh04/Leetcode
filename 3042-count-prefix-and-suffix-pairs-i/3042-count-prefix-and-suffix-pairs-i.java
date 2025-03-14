class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 if(isPrefixAndSuffix(words[i],words[j])==true && i<j){
                    count++;
                 }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2){
           int n1=str1.length() , n2=str2.length();
           if(n1>n2){
            return false;
           }
           return str2.substring(0,n1).equals(str1) && str2.substring(n2-n1).equals(str1);
    }

    }