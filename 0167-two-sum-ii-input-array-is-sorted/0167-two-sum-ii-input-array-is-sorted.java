
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int lookNum =target - numbers[i];

            if(map.containsKey(lookNum)){
                return new  int[] {
                    map.get(lookNum) + 1,i + 1 
                };
               
            }

            map.put(numbers[i] , i);
        }
    return new int[] {-1,-1};
    }
}