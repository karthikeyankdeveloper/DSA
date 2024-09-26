public class GraphMatrix{

    public int vertices;
    public int edges;
    private static int[][] adjMatrix;

    public GraphMatrix(int node){
        adjMatrix = new int[node][node];
        vertices = node;
    }

    private void addEdge(int u,int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        edges++;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vertices : "+vertices+" Edges : "+edges+"\n");
        for(int i=0;i<vertices;i++){
            builder.append(i+"-> ");
            for(int j=0;j<vertices;j++){
                builder.append(adjMatrix[i][j]+" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }


    

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);

        // graph.addEdge(0, 1);
        // graph.addEdge(1,2);
        // graph.addEdge(2,3);
        // graph.addEdge(3,0);
        graph.addEdge(0, 3);    
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(2,1);
        graph.addEdge(1,0);
        graph.addEdge(1,3);

        System.out.println(graph);

    }
}
