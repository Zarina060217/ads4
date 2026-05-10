public class Experiment {
    private long[] bfsTimes;
    private long[] dfsTimes;
    private int[] graphSizes;
    public Experiment() {
        graphSizes = new int[]{10, 30, 100};
        bfsTimes = new long[3];
        dfsTimes = new long[3];
    }
    public void runMultipleTests() {
        System.out.println("=== Starting Performance Experiments ===\n");
        for (int i = 0; i < graphSizes.length; i++) {
            int n = graphSizes[i]; // Current size to test
            Graph g = buildTestGraph(n); // Create the graph manually
            if (n == 10) {
                g.printGraph();
            }
            long startBfs = System.nanoTime();
            g.bfs(0);
            long endBfs = System.nanoTime();
            bfsTimes[i] = endBfs - startBfs;

            long startDfs = System.nanoTime();
            g.dfs(0);
            long endDfs = System.nanoTime();
            dfsTimes[i] = endDfs - startDfs;
        }
    }

    private Graph buildTestGraph(int n) {
        Graph g = new Graph(n);
        // Connect vertices in a chain so the algorithms have a path to follow
        for (int i = 0; i < n - 1; i++) {
            g.addEdge(i, i + 1); // Connect vertex i to the next vertex
            if (i % 5 == 0 && i > 0) {
                g.addEdge(i, 0);
            }
        }
        return g;
    }
    public void printResultsTable() {
        System.out.println("=== FINAL EXPERIMENTAL RESULTS ===");
        System.out.println("Vertices | BFS Time (ns) | DFS Time (ns)");
        System.out.println("---------+---------------+---------------");
        for (int i = 0; i < graphSizes.length; i++) {
            System.out.print(graphSizes[i] + " \t | ");
            System.out.print(bfsTimes[i] + " \t | ");
            System.out.println(dfsTimes[i]);
        }
    }
}