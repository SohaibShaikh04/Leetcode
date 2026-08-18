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
                DFS(adj, i, visited);
                count++;
            }
        }

        return count;
    }

    public void DFS(ArrayList<Integer>[] adj, int u, boolean[] visited) {
        if (visited[u]) {
            return;
        }

        visited[u] = true;

        for (int v : adj[u]) {
            if (!visited[v]) {
                DFS(adj, v, visited);
            }
        }
    }
}