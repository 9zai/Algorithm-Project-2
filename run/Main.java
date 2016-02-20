package al.run;

import al.yi.completeGraph;
import al.yi.sparseGraph;

public class Main {
	public static void main(String[] args){
		sparseGraph g1 = new sparseGraph(10);
		
		int [][] adj = g1.getTwoDimensionArray();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(Constances.MAX != adj[i][j]){
					System.out.print(" "+adj[i][j]);
				}else{
					System.out.print(" X");
				}
			}
			System.out.println();
		}
	}
}
