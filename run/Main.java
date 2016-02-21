package al.run;

import java.util.LinkedList;

import al.yi.completeGraph;
import al.yi.dijkstra;
import al.yi.floyd;
import al.yi.sparseGraph;

public class Main {
	public static void main(String[] args){
		int size = 10;
		sparseGraph g1 = new sparseGraph(size);
		
		int [][] adj = g1.getTwoDimensionArray();
		System.out.println("Adjacency Matrix");
		Constances.printMatrix(size, adj);
		System.out.println("Floyd's Two Dim");
		floyd.compute(adj, size);
		System.out.println("Dijkstra's Two Dim");
		dijkstra.compute(adj, size);
		
		int [] oadj = g1.getOneDimensionArray();
		System.out.println("One Dim Adj Matrix");
//		Constances.oneDimTranAndPrint(size,oadj);
		System.out.println("Floyd's One Dim");
		floyd.compute(oadj, size);
		System.out.println("Dijkstra's One Dim");
		dijkstra.compute(oadj, size);
		
		LinkedList<Integer[]>[] ladj = g1.getLinkedList();
		System.out.println("LinkedList Adj Matrix");
//		Constances.printMatrix(size, ladj);
		System.out.println("Floyd's LinkedList");
		floyd.compute(ladj, size);
		System.out.println("Dijkstra's LinkedList");
		dijkstra.compute(ladj, size);

	}
}
