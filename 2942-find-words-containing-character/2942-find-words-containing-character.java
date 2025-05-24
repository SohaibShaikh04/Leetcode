class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(words[i].charAt(j)==x)
                {
                 list.add(i);
                 break; //To avoid duplicates
                }
            }

        }
        return list;
    }
}

// since list use karr rhe toh duplicates bhi aajaenge par apne ko ek baar hi count lena hai toh jaisi woh update ho break kardenge