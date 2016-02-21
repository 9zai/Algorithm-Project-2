package al.run;

import java.util.LinkedList;

public class Constances {
	public final static int MAX = 10000;
	
	public final static int[] getIJ(int k,int size){
		int [] index = new int[2];
		while(k > (size-1)){
			index[1]++;
			k -=(size-1);
		}
		index[0] = k;
		return index;
	}
	
	public final static int getK(int i,int j,int size){
		int k;
		if(i < j){
			int b = i;
			i = j;
			j = b;
		}
		if(j>0){
			k = ( j*(2*size -1 -j)) /2 +i-j-1;
		}else{
			k = (i-1)-j;
		}
		
		return k;
	}
	
	public final static void printMatrix(int dim,int[][] mat){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(mat[i][j] == MAX){
					System.out.print("X ");
				}
				else{
					System.out.print(mat[i][j]+" ");
				}			
			}
			System.out.println("");
		}
	}

	public final static void printMatrix(int dim,int[] mat){
		oneDimTranAndPrint(dim,mat);
	}
	
	public static void printMatrix(int dim,LinkedList<Integer[]>[] mat){
		for(int i=0;i<dim;i++){
			LinkedList<Integer[]> startNode = mat[i];
			int len = startNode.size();
			System.out.print("start node: "+startNode.get(0)[0]);
			for(int j=1;j<len;j++){
				Integer[] end = startNode.get(j);
				System.out.print(" node: "+end[0] +" wieght: "+end[1]);
			}
			System.out.println("");
		}
	}

	
	private static void oneDimTranAndPrint(int size,int[] mat) {
		// TODO Auto-generated method stub
		int[][] adj = new int[size][size];
		
		for(int i=0;i<size;i++){
			adj[i][i] =0;
			for(int j=i+1;j<size;j++){
				adj[i][j] = mat[getK(i,j,size)];
				adj[j][i] = adj[i][j];
			}
		}
		printMatrix(size,adj);
	}
	
}
