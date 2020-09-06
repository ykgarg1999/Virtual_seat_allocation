package sacls;

import java.util.ArrayList;
import java.util.Scanner;

public class cmn_ele {
	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList(5);
		ArrayList ar2 = new ArrayList(5);
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		for(int i=0;i<5;i++) {
			ar1.add(sc .nextInt());
		}
		for(int i=0;i<5;i++) {
			ar2.add(sc .nextInt());
		}
		for(int i=0;i<5;i++) {
			if(ar2.contains(ar1.get(i))) {
				System.out.println(ar1.get(i));
			}
		}
		
	}
}
