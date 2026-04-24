


class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> list = new ArrayList<>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length - 2;i++){
            int left = i+1;
            int right =  nums.length - 1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            
            while(right >left){
                if(nums[left] + nums[right] == - (nums[i])){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    
                  while (nums[left] == nums[left-1] && left < right) {
                        left++;
                    }
                }
                else if(nums[left] + nums[right] > - (nums[i])){
                    right--;
                }
                else{
                    left++;
                }
            }
         }
         return list;
    }
}