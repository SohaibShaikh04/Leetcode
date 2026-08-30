class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        ArrayList<Integer>[] adj = new ArrayList[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge : connections){
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u); 
        }

        if(connections.length < n-1) return -1;

        int component = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                component++;
                DFS(adj , i , visited);
            }
        }
     return component - 1;
    }

    public void DFS(ArrayList<Integer>[] adj , int u , boolean[] visited){
        if(visited[u]) return;
        visited[u] = true;

        for(int v : adj[u]){
            if(!visited[v]){
                DFS(adj , v , visited);
            }
        }
    }
}