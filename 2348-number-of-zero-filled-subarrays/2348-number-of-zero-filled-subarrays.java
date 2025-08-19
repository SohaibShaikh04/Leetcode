class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long currentStreak=0;
        long ans=0;
        for(int x : nums){
            if(x==0){
                currentStreak++;
                ans += currentStreak;
            }
            else{
                currentStreak=0;

            }
        }
        return ans;
    }
}
//Jab bhi 0 milega current ko increment karke ans main add karte jaao and jaise hi nahi mile wapas counter ko zero set kardo jisse saare 0 traverse hojaaege contigouous waale ... : )

//error at first cause data type long tha and mujhe int laga : (