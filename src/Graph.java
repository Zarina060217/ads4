import java.util.ArrayList;
public class Graph {
    private ArrayList<Integer>[] adj;// Array of ArrayLists to represent the Adjacency List
    private int size;//total num of vertices in graph

    public Graph(int size) {
        this.size = size;
        adj = new ArrayList[size];// initializing the adjacency list array
        for (int i = 0; i < size; i++) {
            adj[i] = new ArrayList<>();//Each vertex starts with an empty list of neighbors
        }
    }
    public void addVertex(Vertex v) {}

    public void addEdge(int from, int to) {
        adj[from].add(to);//Adds the 'to' vertex ID to the 'from' vertex's neighbor list
    }

    public void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> " + adj[i]);//print vertex id and its neighbors
            System.out.println();
        }
    }
    public void bfs(int start) {
        boolean[] visited = new boolean[size];// Keeps track of which vertices we already visited
        ArrayList<Integer> queue = new ArrayList<>(); // i used simple list as a queue
        visited[start] = true;//flag the starting vertex as visited
        queue.add(start);// add this vertex to queue
        System.out.print("BFS Traversal: ");
        int head = 0;
        while (head < queue.size()) {
            int current = queue.get(head++);//get next vertex from front and move to next
            System.out.print(current + " ");//print current vertex in traversal order
            //look at every neighbour of current vertex
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {//if we didn't visist it yet
                    visited[neighbor] = true;//mark as 'visited'
                    queue.add(neighbor);//but add it to back of gueue, so we can visit it later
                }
            }
        }
        System.out.println();
    }
    public void dfs(int start) {
        boolean[] visited = new boolean[size];
        System.out.print("DFS Traversal: ");
        dfsRecursive(start, visited); // Call the helper method to start the recursion
        System.out.println();
    }
    private void dfsRecursive(int current, boolean[] visited) {
        visited[current] = true; // Mark the current node as visited
        System.out.print(current + " "); // Print it immediately
        for (int neighbor : adj[current]) {
            if (!visited[neighbor]) { // If the neighbor hasn't been visited...
                dfsRecursive(neighbor, visited); // Immediately jump "deeper" into that neighbor
            }
        }
    }
}
