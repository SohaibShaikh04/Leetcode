class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x , map.getOrDefault(x , 0) + 1);
        }
        int luckyNum=-1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                luckyNum = Math.max(luckyNum , key);
            }
        }
        return luckyNum;
    }
}

//optimized with map