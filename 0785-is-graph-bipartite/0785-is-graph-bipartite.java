class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int currColor = 1 ;// colors will be 1 and 0
        //color array
        int[] color = new int[V];
        Arrays.fill(color, -1);
       

        for(int i=0;i<V;i++){
            if(color[i] == -1){

              if(BFS(graph ,i,color,currColor) == false){
                return false;
              } 
            }
           
        }
    return true;

    }
    //BFS implementation 
    public boolean BFS(int[][] adj , int u , int[] color , int currColor)
    {
        Queue<Integer> queue = new LinkedList<>();
        color[u] =currColor;
        queue.offer(u);

        while(! queue.isEmpty()){
            int curr = queue.peek();
            queue.poll();

            for(int v : adj[u])
            {
               if(color[v] == currColor)
               {
                return false;
               }

                if(color[v] == -1)
                {
                    color[v] = 1 - currColor;
                    queue.offer(v);

                    if(BFS(adj , v , color , 1 - currColor) == false){
                        return false;
                    }
                }
                }
            }
        
    return true;
   }
}