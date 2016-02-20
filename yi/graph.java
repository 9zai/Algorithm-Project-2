package al.yi;

import java.util.LinkedList;

public class graph {
	protected int[][] innerGraph;
	private int size;
	public graph(int size){
		//init the innerGraph
		this.size = size;
	}
	
	public int[][] getTwoDimensionArray(){
		int[][] twoDimForm = new int[this.size][this.size];
		
		for(int i=0;i<this.size;i++){
			for(int j=0;j<this.size;j++){
				twoDimForm[i][j] = innerGraph[i][j];
			}
		}
		
		return twoDimForm;
	}
	
	public LinkedList<Integer> getLinkedList(){
		LinkedList<Integer> linkedListForm = new LinkedList<Integer>();
		
		
		return linkedListForm;
	}
	public int[] getOneDimensionArray(){
		int[] oneDimForm = new int[this.size];
		
		return oneDimForm;
	}

}
