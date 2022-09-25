public class Graph2 {
    static int[][] adjMatrix ;
    int vertex;

    public Graph2(int vertex){
        this.vertex = vertex;
        adjMatrix = new int[vertex][vertex];
    }

    public static void addEdge(int i, int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void printTheMatrix(){
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("Vertex " + i + " : ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
       Graph2 g = new Graph2(5);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);

        g.printTheMatrix();
    }
}
