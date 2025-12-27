class Solution {
    public boolean isPalindrome(String s) {
        
        char[] resArr = s.toLowerCase().toCharArray();
        int start=0;
        int end = s.length() - 1 ;
        while(start<end){
            if(!Character.isLetterOrDigit(resArr[start])){
                start++;
                continue;
            }
             if(!Character.isLetterOrDigit(resArr[end])){
                end--;
                continue;
            }

            if(resArr[start] != resArr[end]){
                return false;
            }
            start++;
            end--;
        } 
        return true;
    }
}