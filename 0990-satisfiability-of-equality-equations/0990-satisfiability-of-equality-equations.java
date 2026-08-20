class Solution {
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        int[] rank = new int[26];
        Arrays.fill(rank,0);
        for(int i=0;i<26;i++){
            parent[i] = i;
        }

       for(String s : equations) {
            if(s.charAt(1) == '=')
                Union(s.charAt(0)-'a', s.charAt(3)-'a',parent , rank);
        }
        
        for(String s : equations) {
            if(s.charAt(1) == '!') {
                if(find(s.charAt(0)-'a',parent) == find(s.charAt(3)-'a',parent))
                    return false;
            }
        }
        return true;

        }

    public int find(int x , int[] parent ){
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x] , parent);
    }

    public void Union(int x , int y , int[] parent , int[] rank){
        int x_parent = find(x,parent);
        int y_parent = find(y,parent);

        if(x_parent == y_parent){
            return;
        }
        
            if(rank[x_parent] > rank[y_parent]){
                parent[y_parent] = x_parent;
            }
            else if(rank[x_parent] < rank[y_parent]){
                parent[x_parent] = y_parent;
            }
            else{
                parent[y_parent] = x_parent;
                rank[x_parent]++;
            }
        
    }
}