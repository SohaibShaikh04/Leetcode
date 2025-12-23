class Solution {
    public boolean isPalindrome(String s) {
        
        char[] arr = s.toLowerCase().toCharArray();

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


//Learnt how to use 2 pointers apporach of both opposite sides
// t.c = O(n);