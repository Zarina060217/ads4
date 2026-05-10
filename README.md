A. Project Overview

Graph Structure: This project implements a directed graph using an Adjacency List.  

Vertices and Edges: Vertices represent individual nodes (data points), and Edges represent the directed connections between them.  

Traversal Overview: BFS and DFS are two fundamental algorithms used to visit every node in a graph systematically.

B. Class Descriptions

Vertex: A simple class representing a node with a unique id. 

Edge: Represents a connection from a source vertex to a destination vertex. 

Graph: The core class managing the ArrayList[] adjacency list and traversal logic.  

Adjacency List: A collection of lists where each index i contains a list of all vertices that vertex i points to. 

C. Algorithm Descriptions

BFS (Breadth-First Search)

Explanation: Uses a Queue to visit neighbors level-by-level. It explores all immediate neighbors of the starting node before moving to the next distance level.  

Use Cases: Finding the shortest path in unweighted graphs or social networking.  

Time Complexity: $O(V + E).  

DFS (Depth-First Search)

Explanation: Uses a Stack (via recursion) to go as deep as possible along a branch before backtracking. 

Use Cases: Solving puzzles (like mazes), topological sorting, or detecting cycles in a graph.  

Time Complexity: $O(V + E).  

D. Experimental Results

<img width="519" height="266" alt="image" src="https://github.com/user-attachments/assets/6660dbc7-355c-4914-89cb-0a248568a697" />

Observations: As the number of vertices increases, both execution times generally increase. The small graph (10) showed a high BFS time likely due to initial JVM warmup, but the 100-vertex test shows the true growth.

Analysis Questions (Answers)

Performance: Increasing the graph size increases the time for both, as more nodes and edges must be processed. 

Speed: In these specific experiments, DFS was consistently faster than BFS. 

Complexity: Yes, the results follow O(V + E) because the time grows linearly as we add more vertices and edges. 

Traversal Order: Structure determines the path. For example, in our "line" graph, BFS and DFS visited nodes in the same numerical order. 

BFS Preference: Preferred when looking for the shortest path between two nodes.  

DFS Limitations: It can get stuck in deep paths or infinite loops if cycles aren't handled correctly.

<img width="2815" height="1036" alt="image" src="https://github.com/user-attachments/assets/9fd57671-22bb-49b1-88c8-8bd162503c7b" />


F. Reflection Section

Learning: I learned how to represent complex connections using adjacency lists rather than simple 2D arrays.  


Differences: BFS is wider and uses more memory for the queue, while DFS is deeper and uses the recursion stack.  


Challenges: Implementing the logic without using external libraries required a deeper understanding of how Java handles memory and recursion.

