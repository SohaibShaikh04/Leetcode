class Solution {
    public boolean isPalindrome(String s) {
        String snew = s.toLowerCase();
        char[] arr = snew.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(! Character.isLetterOrDigit(arr[start])){
                start++;
                continue;
        }
        if(! Character.isLetterOrDigit(arr[end])){
            end--;
            continue;
        }
            if(arr[start] != arr[end]){
                return false;
            }
            else{
                start++;
                end--;
            }

        
        }
        return true;
    }
}