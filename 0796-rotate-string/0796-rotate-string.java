class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();

        if(s.length()!=goal.length()){
            return false;
        }
        
       String twice = s + s;
       return twice.contains(goal);
    }
}