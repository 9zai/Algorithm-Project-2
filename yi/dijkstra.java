package al.yi;

import java.util.LinkedList;

import al.run.Constances;

public class dijkstra {//all pairs 
	//graph is undirected, so the path is reversible. But seems to have no advantages. 
	
	public static void compute(final int [][] adjMatrix,int size){
		int[][] d = new int[size][size];
		for(int i=0;i<size;i++){//i as start point
			
			int counter = 1;
			int[] path = adjMatrix[i];
			while(counter <size){
				boolean [] vertexSet = new boolean[size];
				vertexSet[i] = true;
				int min = Constances.MAX;
				int nextNode = 0;
				
				for(int j=0;j<size;j++){//find the next nodes
					if(j == i)	continue;
					if(path[j] < min && !vertexSet[j]){
						nextNode = j;
					}
				}
				vertexSet[nextNode] = true;
				counter++;
				
				for(int j = 0;j<size;j++){//update path
					if(min + adjMatrix[nextNode][j] < path[j]){
						path[j] = min + adjMatrix[nextNode][j];
					}
				}
			}
			d[i] = path;
		}
		System.out.println("Distances Matrix");
		Constances.printMatrix(size, d);
	}
	public static void compute(final int [] adjMatrix,int size){
		int[][] d = new int[size][size];
		
		
	}
	public static void compute(final LinkedList<Integer[]>[] adjMatrix,int size){
		
	}

}
