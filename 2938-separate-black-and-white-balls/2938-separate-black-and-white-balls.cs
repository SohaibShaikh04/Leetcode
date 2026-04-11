public class Solution {
    public long MinimumSteps(string s) {
        int blackCount=0;
        long swapCount=0;
        for(int i=0;i<s.Length;i++){
            if(s[i] == '0'){
                swapCount += blackCount;
            }
            else{
                blackCount++;
            }
        }
        return swapCount;
    }
}