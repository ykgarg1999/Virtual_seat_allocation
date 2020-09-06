package sacls;
import java.lang.Thread;
import java.util.*;

class Row extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}	
	}
	
int addmat(int[][] x,int[][] y,int[][] z){
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}
}
public class add_mat extends Thread {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3,4,5},{2,1,3,4,5},{3,2,4,5,6},{1,3,2,4,5},{3,1,2,5,4,}};
		int[][] b = {{1,2,3,4,5},{2,1,3,4,5},{3,2,4,5,6},{1,3,2,4,5},{3,1,2,5,4,}};
		int[][] c = new int[5][5];
	}

}
