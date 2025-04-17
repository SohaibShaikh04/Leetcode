class Solution {
    public int countPairs(int[] nums, int k) {
        int countPairs=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    countPairs++;
                }
            }
        }
        return countPairs;
    }
}


//Iski better approach ho sakti hai ArrayList se hai par mera mann nahi hai woh karne ka :(

// Mazaak karra hu bhai yeh le ->

// List<Integer> l = new ArrayList<>();
//         for (int i = 1; i * i <= k; i++) {
//             if (k % i == 0) {
//                 l.add(d);
//                 if (i != k / i) divisors.add(k / i);
//             }
//         }