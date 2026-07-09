class Solution {
    public boolean isPalindrome(String s) {
        char[] resultArray = s.toLowerCase().toCharArray();
        int st = 0;
        int e = s.length() -1 ;
        while(st <= e){
            if(!(Character.isLetterOrDigit(resultArray[st]))){
                st++;
                continue;
            }
             if(!(Character.isLetterOrDigit(resultArray[e]))){
                e--;
                continue;
            }

            if(resultArray[st] != resultArray[e]){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}