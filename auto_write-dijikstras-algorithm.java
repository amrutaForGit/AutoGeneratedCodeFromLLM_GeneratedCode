// Imported libraries necessary for the algorithm
import java.util.*; 

public class Dijikstras { 
      
    // Function to find the vertex with the shortest distance, 
    // from the set of vertices not yet included in the shortest path tree
    private static int minimumDistance(int distance[], Boolean shortestPathTreeSet[], int verticesCount) { 
        int min = Integer.MAX_VALUE, min_index = -1; 
   
        for (int v = 0; v < verticesCount; v++) 
            if (!shortestPathTreeSet[v] && distance[v] <= min) { 
                min = distance[v]; 
                min_index = v; 
            } 
   
        return min_index; 
    } 
  
    // Function that implements Dijkstra's single source shortest path 
    // algorithm for a graph represented using adjacency matrix representation
    public void dijsktra(int graph[][], int sourceVertex) { 
        int verticesCount = graph[0].length; 
        int distance[] = new int[verticesCount]; // The output array. distance[i] will hold the shortest distance from sourceVertex to i 
        Boolean shortestPathTreeSet[] = new Boolean[verticesCount]; // shortestPathTreeSet[i] will be true if vertex i is included in the shortest path from source to i, false otherwise 

        // Initialize all distances as INFINITE and shortestPathTreeSet[] as false 
        for (int v = 0; v < verticesCount; v++) { 
            distance[v] = Integer.MAX_VALUE; 
            shortestPathTreeSet[v] = false; 
        } 
   
        // Distance of source vertex from itself is always 0 
        distance[sourceVertex] = 0; 
   
        // Find shortest path for all vertices 
        for (int count = 0; count < verticesCount - 1; count++) { 
            // Pick the minimum distance vertex from the set of vertices not yet included in shortestPathTreeSet 
            int u = minimumDistance(distance, shortestPathTreeSet, verticesCount); 
   
            // Mark the picked vertex as processed 
            shortestPathTreeSet[u] = true; 
   
            // Update distance value of the adjacent vertices of the picked vertex. 
            for (int v = 0; v < verticesCount; v++) 
                // Update distance[v] only if is not in shortestPathTreeSet, there is an edge from u to v, and 
                // total weight of path from source to v through u is smaller than current value of distance[v] 
                if (!shortestPathTreeSet[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]) 
                    distance[v] = distance[u] + graph[u][v]; 
        } 
        printSolution(distance);
    } 

    // Function to print the constructed distance array 
    private static void printSolution(int distances[]) { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < distances.length; i++) 
            System.out.println(i + " \t\t " + distances[i]); 
    }  
}