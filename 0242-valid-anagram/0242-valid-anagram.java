class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Schar = s.toCharArray();
        char[] Tchar = t.toCharArray();
        Arrays.sort(Schar);
        Arrays.sort(Tchar);
        return Arrays.equals(Schar,Tchar);
        }
    }