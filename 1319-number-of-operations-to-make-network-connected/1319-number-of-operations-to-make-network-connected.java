class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] parent = new int[n];
        int[] rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        
        int edges = connections.length;
        if(edges < n-1) return -1;


        int components = n;
        for(int[] edge : connections){
            int x = edge[0];
            int y = edge[1];
            int x_p = find(x,parent);
            int y_p = find(y,parent);
            if(x_p != y_p){
                components--;
                Union(x_p , y_p , parent , rank );
            }
            
        }
        return components - 1;
    }


    public void Union(int x  , int y , int[] parent , int[] rank){

        int x_parent = find(x , parent);
        int y_parent = find(y , parent);

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

    public int find(int x , int[]  parent){
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x] , parent);
    }
}

/// Bhaiii DSU samjh gyaaaaa haiii proper full code khud se ! --Sohaib ;)