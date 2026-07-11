class Solution {
    public int trap(int[] height) {
        int waterCount = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int tallestl=0;
        for(int i =0;i<height.length;i++){
            tallestl = Math.max(tallestl , height[i]);
            leftMax[i] = tallestl;
        }
        int tallestr=0;
        for(int i =height.length-1;i>=0;i--){
            tallestr = Math.max(tallestr , height[i]);
            rightMax[i] = tallestr;
        }
        
        for(int i=0;i<height.length;i++){
            int maxHeight = Math.min(leftMax[i] , rightMax[i]);
            waterCount += maxHeight - height[i];
        }
        return waterCount; 
    }
}

// I just got this algorithm by just thinking of the walls and the restriction over the shorter wall that no longer ho long the longer wall is the only way water will be stored will be decided by the shorter wall indeed this intution came because I solved container with most water ; )
//Sohaib's Solution!