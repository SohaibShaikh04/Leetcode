class Solution {
    ArrayList<Integer>[] adj; 
    Map<Integer, Integer> bobPath;
    int max = Integer.MIN_VALUE; 
    int[] amount; 
    boolean[] visited; 

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        
        int n = amount.length;
        bobPath = new HashMap<Integer, Integer>();
        this.amount = amount;
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++)
            adj[i] = new ArrayList<Integer>();
        
        visited = new boolean[n];

      
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        
        bobPath(bob, 0); 

        // Find Alice's maximum profit path
        Arrays.fill(visited, false); 
        alice(0, 0, 0); 

        return max; 
    }

    private boolean bobPath(int node, int time) {
        visited[node] = true;
        bobPath.put(node, time); 

        if(node == 0) { 
            return true;
        }

        // Traverse neighbors to find a path to node 0
        for(int nei : adj[node]) {
            if(!visited[nei] && bobPath(nei, time + 1)) {
                return true;
            }
        }

        // Undo the path if not leading to node 0
        bobPath.remove(node);
        return false;
    }
    
    // DFS to calculate maximum income for Alice
    private void alice(int node, int time, int income) {
        visited[node] = true;

        // If Alice reaches first, collect full amount
        if(!bobPath.containsKey(node) || time < bobPath.get(node)) {
            income += amount[node];
        }
        // If both reach at the same time, collect half the amount
        else if(time == bobPath.get(node)) {
            income += amount[node] / 2;
        }
        
        // If leaf node (not root), update max profit
        if(adj[node].size() == 1 && node != 0) {
            max = Math.max(max, income);
        }

        // Recur for all unvisited neighbors
        for(int nei : adj[node]) {
            if(!visited[nei]) {
                alice(nei, time + 1, income);
            }
        }
    }
}