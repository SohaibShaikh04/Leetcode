class Solution {
    public int subarrayBitwiseORs(int[] arr) {
         Set<Integer> res = new HashSet<>();
        
        
        Set<Integer> curr = new HashSet<>();

        for (int x : arr) {
            
            Set<Integer> nextOrs = new HashSet<>();
            nextOrs.add(x);

           
            for (int y : curr) {
                nextOrs.add(x | y);
            }

      
            res.addAll(nextOrs);
        
            curr = nextOrs;
        }

        return res.size();
    }
}