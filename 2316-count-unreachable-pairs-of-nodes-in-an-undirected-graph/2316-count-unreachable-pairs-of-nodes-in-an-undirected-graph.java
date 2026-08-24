class Solution {
    public long countPairs(int n, int[][] edges) {
        int[] parents = new int[n];
        int[] rank = new int[n];

        for(int i=0;i<n;i++){
            parents[i] = i;
            rank[i] = 0;
        }
        boolean[] visited =  new boolean[n];

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            Union(u,v,parents,rank);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int parent = Find(i,parents);
            map.put(parent, map.getOrDefault(parent, 0) + 1);
        }

            long  result = 0;
            long  remaining = n;
        for (int size : map.values()) 
        {
            result += size * (remaining - size);
            remaining -= size;
        }
        return result;
    }

    public int Find(int x , int[] parents)
    {
        if(x == parents[x]){
            return x;
        }

        return parents[x] = Find(parents[x] , parents);
    }


    public void Union(int x , int y , int[] parents , int[] rank)
    {

        int x_p = Find(x , parents);
        int y_p = Find(y , parents);
        if(x_p == y_p){
            return ;
            
        }

        if(parents[x_p] > parents[y_p]){
            parents[y_p] = x_p;
        }

        else if(parents[x_p] < parents[y_p]){
            parents[x_p] = y_p;
        }
        else{
            parents[y_p] = x_p;
            rank[x_p]++;
        }
    }

}