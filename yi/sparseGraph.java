package al.yi;

import java.util.Random;

import al.run.Constances;

public class sparseGraph extends graph{

	public sparseGraph(int size) {
		super(size);
		// TODO Auto-generated constructor stub
		Random rand = new Random();
		this.innerGraph = new int[size][size];
		
		for(int i=0;i<size;i++){
			innerGraph[i][i] = 0;
			
			int node = i>0 ? rand.nextInt(i):0;
			if(i>0){
				this.innerGraph[i][node] = rand.nextInt(150)+1;
				this.innerGraph[node][i] = this.innerGraph[i][node];
			}
			
			for(int j=i+1;j<size;j++){
				if(j == node) continue;
				else{
					this.innerGraph[i][j] = Constances.MAX;
					this.innerGraph[j][i] = Constances.MAX;
				}
			}
		}
	}

}
