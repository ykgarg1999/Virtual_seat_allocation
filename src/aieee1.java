import java.util.*;

class  inst{
	private String inst_name;
	private int seats_cse,seats_ece,seats_me,seats_it;
	inst(String nam,int cse,int ece,int me,int it){
		this.inst_name=nam;
		this.seats_cse=cse;
		this.seats_ece=ece;
		this.seats_me=me;
		this.seats_it=it;
	}
	public int get_cse() {
		return seats_cse;
	}
	public int get_ece() {
		return seats_ece;
	}
	public int get_me() {
		return seats_me;
	}
	public String get_clg() {
		return inst_name;
	}
	
	public boolean cse_dec() {
		if(seats_cse>0) {
			seats_cse--;
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public boolean ece_dec() {
		if(seats_ece>0) {
			seats_ece--;
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean me_dec() {
		if(seats_me>0) {
			seats_me--;
			return true;
			
		}
		else {
			return false;
		}
	}
}

class student{
	
	String clg_nam,cor_nam;
	int rank;
	
	student(int rank2, String clg_nam2, String cor_nam2) {
		// TODO Auto-generated method stub
		this.rank=rank2;
		this.clg_nam=clg_nam2;
		this.cor_nam=cor_nam2;
		
	}
	public void rnk_dsply() {
		System.out.println(rank);
	}
	
	
}
public class aieee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inst uni_1 = new inst("PTU",2,0,0,0);
		inst uni_2 = new inst("CU",0,1,0,0);
		inst uni_3 = new inst("CGC",0,1,0,0);
		Scanner sc = new Scanner(System.in);
		int clg,cor,count=0;
		int total_seats=(uni_1.get_cse()+uni_1.get_ece()+uni_1.get_me())+(uni_2.get_cse()+uni_2.get_ece()+uni_2.get_me())+(uni_3.get_cse()+uni_3.get_ece()+uni_3.get_me());
		int total_stu=5;
		student st[]=new student[5];
		student rem_st[]=new student[5];
		int[] ranks = new int[5];
		
		while(total_seats!=0) {
			for(count=0;count<total_stu;count++) {
				System.out.println("Student Enter details\nRank: ");
				int rnk=sc.nextInt();
				System.out.println("1.Ptu\n2.Cgc\n3.Cu\n4.Exit");
				clg=sc.nextInt();
				switch(clg) {
				case 1:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					cor=sc.nextInt();
					switch(cor) {
					case 1:
						st[count]=new student(rnk,"Ptu","Cse");
						break;
					case 2:
						st[count]=new student(rnk,"Ptu","Ece");
						break;
					case 3:
						st[count]=new student(rnk,"Ptu","Me");
						break;	
					}
					break;
					
				case 2:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					cor=sc.nextInt();
					switch(cor) {
					case 1:
						st[count]=new student(rnk,"Cgc","Cse");
						break;
					case 2:
						st[count]=new student(rnk,"Cgc","Ece");
						break;
					case 3:
						st[count]=new student(rnk,"Cgc","Me");
						break;	
					}
					break;
				case 3:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					cor=sc.nextInt();
					switch(cor) {
					case 1:
						st[count]=new student(rnk,"Cu","Cse");
						break;
					case 2:
						st[count]=new student(rnk,"Cu","Ece");
						break;
					case 3:
						st[count]=new student(rnk,"Cu","Me");
						break;	
					}
					break;
				}
			}
				
			/*for(int i=0;i<total_stu-1;i++) {
				for(int j=0;j<total_stu-i-1;j++) {
					if(st[j].rank>st[j+1].rank) {
						student temp = st[j];
						st[j]=st[j+1];
						st[j+1]=temp;
					}
				}
			}
			*/
			int count1=0,stu_admit=0;
			for(int i=0;i<total_stu;i++) {
				
				if(st[i].clg_nam == "Ptu") {
					if(st[i].cor_nam == "Cse") {
						if(!(uni_1.cse_dec())) {
							rem_st[count1]=new student(st[i].rank,"Ptu","Cse");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
						
					}
					else if(st[i].cor_nam == "Ece") {
						if(!(uni_1.ece_dec())) {
							rem_st[count1]=new student(st[i].rank,"Ptu","Ece");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
					else if(st[i].cor_nam == "Me") {
						if(!(uni_1.me_dec())) {
							rem_st[count1]=new student(st[i].rank,"Ptu","Me");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
				}
				else if(st[i].clg_nam == "Cgc") {
					if(st[i].cor_nam == "Cse") {
						if(!(uni_2.cse_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cgc","Cse");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
						
					}
					else if(st[i].cor_nam == "Ece") {
						if(!(uni_2.ece_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cgc","Ece");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
					else if(st[i].cor_nam == "Me") {
						if(!(uni_2.me_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cgc","Me");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
				}
				else if(st[i].clg_nam == "Cu") {
					if(st[i].cor_nam == "Cse") {
						if(!(uni_3.cse_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cu","Cse");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
					else if(st[i].cor_nam == "Ece") {
						if(!(uni_3.ece_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cu","Ece");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
					else if(st[i].cor_nam == "Me") {
						if(!(uni_3.me_dec())) {
							rem_st[count1]=new student(st[i].rank,"Cu","Me");
							count1++;
						}
						else {
							total_seats--;
							stu_admit++;
						}
					}
				}
			}
			
			total_stu=total_stu-stu_admit;
			System.out.println("These students haven't got the seats due to non-availability: ");
			for(int i=0;i<total_stu;i++) {
				System.out.print(rem_st[i].rank+" , ");
			}
			
		}	
	}
}	
