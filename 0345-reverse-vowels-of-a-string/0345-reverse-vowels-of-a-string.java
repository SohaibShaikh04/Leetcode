class Solution {




  

    public String reverseVowels(String s) {
        int start=0;
        int end = s.length() - 1;
        String vowels="AEIOUaeiou";
        char[] chars = s.toCharArray();
        while(start<end ){
            while(start < end  && vowels.indexOf(chars[start]) == -1 ){
                start++;
            }
            while(start < end  && vowels.indexOf(chars[end]) == -1 ){
                end--;
            }


            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
            
        }
        return chars.toString();
    }
}