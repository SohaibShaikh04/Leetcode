class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     ArrayList<Integer> list = new ArrayList<>();
     int n=words.length;
     for(int i=0;i<n;i++){
        if(words[i].indexOf(x)!=-1){
            list.add(i);
        }
     }
        return list ;
    }
}


//learnt about a new function called "indexOf()" -> helps to find the first occurence of  a word in a string .....//
//this makes the time complexity to O(n);