class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        ArrayList<Integer>[] adj = new ArrayList[V];
        int[] indegree = new int[V];
        for(int i =0 ;i<V;i++){
            adj[i]= new ArrayList<>();
        }

        for(int[] edge : prerequisites){
            int v = edge[0];
            int u = edge[1];
            adj[u].add(v);
            indegree[v]++;
        }
        return topSort(adj , indegree,V );
         
    }

    public boolean topSort(ArrayList<Integer>[] adj , int[] indegree , int V){
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0 ; i<V ; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int count=0;
        while(! q.isEmpty()){
            count++;
            int curr = q.peek();
            q.poll();
            for(int v : adj[curr]){
                indegree[v]--;
                if(indegree[v] == 0){
                    
                    q.offer(v);
                }
            }
        }
        return count == V;

    }


}

//Eventually it literally hitted that its topsort because u was must before v which is condition for topsport too so just checked if top sort or not the only difference was u and v were swapped in this question ;) --Sohaib