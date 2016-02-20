package al.yi;

import java.util.Random;

public class completeGraph extends graph{

	public completeGraph(int size) {
		super(size);
		// TODO Auto-generated constructor stub
		this.innerGraph = new int[size][size];
		Random rand = new Random();
		
		for(int i=0;i<size;i++){
			this.innerGraph[i][i] = 0;
			for(int j=i+1;j<size;j++){
				this.innerGraph[i][j] = rand.nextInt(150)+1;//avoid 0
				this.innerGraph[j][i] = this.innerGraph[i][j];
			}
		}
	}

}
