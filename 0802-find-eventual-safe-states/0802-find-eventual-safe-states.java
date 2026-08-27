class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;


        int[] state = new int[n];

        List<Integer> ans = new ArrayList<>();

    
        for (int i = 0; i < n; i++) {

            if (dfs(i, graph, state)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean dfs(int node, int[][] graph, int[] state) {

        // Already safe
        if (state[node] == 2) {
            return true;
        }

      
        if (state[node] == 1) {
            return false;
        }

        state[node] = 1;

        
        for (int neighbour : graph[node]) {

            if (!dfs(neighbour, graph, state)) {
                return false;
            }
        }

        
        state[node] = 2;

        return true;
    }
}