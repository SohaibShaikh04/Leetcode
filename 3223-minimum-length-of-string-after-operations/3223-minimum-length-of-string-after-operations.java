class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> map= new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int len = 0;

        for (int count : map.values()) {
            if (count > 2) {
                if (count % 2 == 0) {
                    len += (count - 2);
                } else {
                    len += (count - 1);
                }
            }
        }

        return s.length() - len;
    }
}