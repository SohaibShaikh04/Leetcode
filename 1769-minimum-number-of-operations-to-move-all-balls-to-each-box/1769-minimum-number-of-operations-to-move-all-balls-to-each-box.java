class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            if(boxes.charAt(i) == '1') {
                hs.add(i);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int idx : hs) {
                ans[i] += Math.abs(idx-i);
            }
        }
        return ans;        
    }
}