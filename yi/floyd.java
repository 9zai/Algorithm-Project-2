package al.yi;

import java.util.LinkedList;

import al.run.Constances;

public class floyd {// all pairs

	public static void compute(final int [][] adjMatrix,int size){
		
//		int[][] p = new int[size][size];//may be removable
		int[][] d = adjMatrix;
		
		for(int k=0;k<size;k++){//check for every node whether the paths can be reduced or connected.
			//can be reduce by j = i+1 but does no matter.
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++){
					if(d[i][j] > (d[i][k] + d[k][j])){
//						p[i][j] = k+1;
						d[i][j] = d[i][k] + d[k][j];
						d[j][i] = d[i][j];
					}
				}
			}
		}
		System.out.println("Distances Matrix");
		Constances.printMatrix(size, d);
//		System.out.println("Path Matrix");
//		Constances.printMatrix(size, p);
		
	}
	public static void compute(final int [] adjMatrix,int size){
		int[][] d = new int[size][size];
		
		for(int k=-1;k<size;k++){
			if(k>=0){
				d[k][k] = 0;
			}
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++){
					if(k==-1){
						d[i][j] = adjMatrix[Constances.getK(i, j, size)];
						d[j][i] = d[i][j];
						continue;	
					}else{
						if(d[i][j] > (d[i][k] + d[k][j])){
							d[i][j] = d[i][k] + d[k][j];
							d[j][i] = d[i][j];
						}
					}
				}
			}
		}
		
		System.out.println("Distances Matrix");
		Constances.printMatrix(size, d);
	}
	public static void compute(final LinkedList<Integer[]>[] adjMatrix,int size){
		int[][] d = new int[size][size];
		
		for(int i=0;i<size;i++){
			LinkedList<Integer[]> startNode = adjMatrix[i];
			int len = startNode.size();
			for(int j=1;j<len;j++){
				int end = startNode.get(j)[0];
				int weight = startNode.get(j)[1];
				d[i][end] = weight;
			}
		}
		
		for(int k=-1;k<size;k++){
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++){
					if(k==-1){
						if(d[i][j] == 0 && i!=j){
							d[i][j] = Constances.MAX;
							d[j][i] = d[i][j];
						}
					}else{
						if(d[i][j] > (d[i][k]+d[k][j])){
							d[i][j] = d[i][k]+d[k][j];
							d[j][i] = d[i][j];
						}
					}
				}
			}
		}
		
		System.out.println("Distences Matrix");
		Constances.printMatrix(size, d);
	}
}
