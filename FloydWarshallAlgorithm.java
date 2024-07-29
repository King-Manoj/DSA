package dsa;

							//Inventor -  Robert W.Floyd and Stephen Warshall 
							//Time Complexity - O(n^3)
							//Space Complexity - O(n^2)

public class FloydWarshallAlgorithm {

	public static void main(String[] args) {
		
				// edges[0] - from
				// edges[1] - to
				// edges[2] - weight
		
		int[][] edges = {
			    {0, 1, 3},
			    {1, 2, 1},
			    {1, 3, 4},
			    {2, 3, 1}
			};
		
		int result[][] = floydWarshall(edges);
		int n = result.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] floydWarshall(int edges[][]){
		
		int n = edges.length;
		int INF = (int) 1e9 + 7;
		
		int dist[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) {
					dist[i][j] = INF;
				}
				else {
					dist[i][j] = 0;
				}
			}
		}
		
		// Calculate the initial distances based on edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            dist[u][v] = w;
        }
        
        //Floyd Warshall Algorithm
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}
		
		return dist;
		
	}

}
