import java.util.Scanner;

class cas{
	public
	String c = new String();
	int dcap ;
	int tcap;
	
}
public class Code {
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("yesoudiuwdbcidsbcwdb");
		int days = sc .nextInt();
		int n = sc.nextInt();
		cas[] arr = new cas[n];

		for(int i=0;i<n;i++) {
			arr[i].c = sc.next();
			arr[i].dcap = sc.nextInt();
			arr[i].tcap = sc.nextInt();
		}
		int np = sc.nextInt();
		String[] str = new String[np];

		for(int i=0;i<np;i++) {
			str[i]=sc.next();
		}
		System.out.println("  "+arr[1].dcap);
		

	}

}
