class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;

        ArrayList<Integer>[] adj = new ArrayList[V];
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (isConnected[i][j] == 1) {
                    adj[i].add(j);
                }
            }
        }

        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFS(adj, i, visited);
                count++;
            }
        }

        return count;
    }

    public void BFS(ArrayList<Integer>[] adj, int u, boolean[] visited) {
        if (visited[u]) {
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        visited[u] = true;
        q.offer(u);

        while(!q.isEmpty()){
            int N = q.peek();
            q.poll();
            for(int v : adj[N]){
                if(!visited[v])
                {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
}

//BFS SE BHI KARDIAAA ; ) 