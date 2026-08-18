class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        ArrayList<Integer>[] adj = new ArrayList[V];
        ArrayList<Integer> ans = new ArrayList<>();
        int[] indegree = new int[V];

        for(int i = 0; i < V; i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge : prerequisites){
            int v = edge[0];
            int u = edge[1];

            adj[u].add(v);
            indegree[v]++;
        }

        topSort(adj, indegree, ans, V);

        if(ans.size() != V){
            return new int[0];
        }

        int[] result = new int[V];

        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }

    public void topSort(ArrayList<Integer>[] adj, int[] indegree, ArrayList<Integer> ans, int V){
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);

            for(int v : adj[curr]){
                indegree[v]--;

                if(indegree[v] == 0){
                    q.offer(v);
                }
            }
        }
    }
}

//Again same topological sort and return the order used BFS for this