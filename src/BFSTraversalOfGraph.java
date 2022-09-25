import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversalOfGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int s, int d){
        adjList.get(s).add(d);
        adjList.get(d).add(s);
    }

    public static ArrayList<Integer> bfsTravel(ArrayList<ArrayList<Integer>> adjList, int V){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()){
            Integer node = queue.poll();
            bfs.add(node);

            for (Integer it : adjList.get(node)){
                if(!visited[it]){
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int V = 10;
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        addEdge(list, 0, 1);
        addEdge(list, 1, 2);
        addEdge(list, 1, 3);
        addEdge(list, 0, 4);

        System.out.println(bfsTravel(list,V));
    }
}
