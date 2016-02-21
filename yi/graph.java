package al.yi;

import java.util.LinkedList;

import al.run.Constances;

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
	
	public LinkedList<Integer[]>[] getLinkedList(){
		LinkedList<Integer[]>[] linkedListForm = new LinkedList[this.size];
		
		for(int i=0;i<size;i++){
			LinkedList<Integer[]> startNode = new LinkedList<Integer[]>();
			Integer[] self = {i,0};
			startNode.add(self);
			
			for(int j=0;j<size;j++){
				if(this.innerGraph[i][j]!= Constances.MAX && i!=j){
					Integer[] end = {j,this.innerGraph[i][j]};
					startNode.add(end);
				}
			}
			linkedListForm[i] = startNode;
		}
		
		return linkedListForm;
	}
	public int[] getOneDimensionArray(){// Top down
		int[] oneDimForm = new int[(this.size*(this.size - 1)) /2 ];
		int counter =0;
		for(int j=0;j<this.size-1;j++){//col
			for(int i=j+1;i<this.size;i++){//row
				oneDimForm[counter++] = this.innerGraph[i][j];
			}
		}
		return oneDimForm;
	}

}
