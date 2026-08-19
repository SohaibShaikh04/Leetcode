class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int currColor = 1 ;// colors will be 1 and 0
        //color array
        int[] color = new int[V];
        Arrays.fill(color, -1);
       

        for(int i=0;i<V;i++){
            if(color[i] == -1){

              if(DFS(graph ,i,color,currColor) == false){
                return false;
              } 
            }
           
        }
    return true;

    }
    //DFS implementation 
    public boolean DFS(int[][] adj , int u , int[] color , int currColor)
    {
        color[u] =currColor;

        for(int v : adj[u]){
            if(color[v] == currColor){
                return false;
            }
            if(color[v] == -1){
                color[v] = 1 - currColor;

                if(DFS(adj , v , color , 1 - currColor) == false){
                    return false;
                }
        }
    }
    return true;
}

  //Can't believe solved the whole graph question on my own -Sohaib ;)
}