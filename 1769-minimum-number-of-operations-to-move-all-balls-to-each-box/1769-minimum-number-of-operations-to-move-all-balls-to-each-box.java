// class Solution {
//     public int[] minOperations(String boxes) {
//         int n=boxes.length();
//         int[] ans;
//         int[] Box = new int[n];
//         for(int i=0;i<n;i++){
//             Box[i]+=boxes.charAt(i)-'0';
//         }
//         int[] ans = new int[s.length()];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(Box[i]==1){
//                     ans[j]=abs(Box[i] - j);
//                 }
//             }
//         }

//         } 
//     } 


class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int total = 0;
        for (int i = 0; i < boxes.length(); i++) {
            total = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i == j)
                    continue;
                total += Math.abs(j - i) * Character.getNumericValue(boxes.charAt(j));
            }
            ans[i] = total;
        }
        return ans;
    }
}
