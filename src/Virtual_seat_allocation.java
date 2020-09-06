import java.util.*;

class  Institutes{
	private String institute_name;
	private int seats_cse,seats_ece,seats_me,seats_it;
	Institutes(String nam,int cse,int ece,int me,int it){
		this.institute_name=nam;
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
		return institute_name;
	}
	
	public boolean cse_decrease() {
		if(seats_cse>0) {
			seats_cse--;
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public boolean ece_decrease() {
		if(seats_ece>0) {
			seats_ece--;
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean me_decrease() {
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
	
	String college_name,course_name;
	int rank;
	
	student(int rank2, String clg_nam2, String cor_nam2) {
		// TODO Auto-generated method stub
		this.rank=rank2;
		this.college_name=clg_nam2;
		this.course_name=cor_nam2;
		
	}
	public void rank_display() {
		System.out.println(rank);
	}
	
	
}
public class Virtual_seat_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institutes university_1 = new Institutes("PTU",2,0,0,0);
		Institutes university_2 = new Institutes("CU",0,1,0,0);
		Institutes university_3 = new Institutes("CGC",0,1,0,0);
		Scanner sc = new Scanner(System.in);
		int college,course,count=0;
		int total_seats=(university_1.get_cse()+university_1.get_ece()+university_1.get_me())+(university_2.get_cse()+university_2.get_ece()+university_2.get_me())+(university_3.get_cse()+university_3.get_ece()+university_3.get_me());
		int total_students=5;
		student students[]=new student[5];
		student remaining_students[]=new student[5];
		int[] ranks = new int[5];
		
		while(total_seats!=0) {
			for(count=0;count<total_students;count++) {
				System.out.println("Student Enter details\nRank: ");
				int rank=sc.nextInt();
				System.out.println("1.Ptu\n2.Cgc\n3.Cu\n4.Exit");
				college=sc.nextInt();
				switch(college) {
				case 1:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					course=sc.nextInt();
					switch(course) {
					case 1:
						students[count]=new student(rank,"Ptu","Cse");
						break;
					case 2:
						students[count]=new student(rank,"Ptu","Ece");
						break;
					case 3:
						students[count]=new student(rank,"Ptu","Me");
						break;	
					}
					break;
					
				case 2:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					course=sc.nextInt();
					switch(course) {
					case 1:
						students[count]=new student(rank,"Cgc","Cse");
						break;
					case 2:
						students[count]=new student(rank,"Cgc","Ece");
						break;
					case 3:
						students[count]=new student(rank,"Cgc","Me");
						break;	
					}
					break;
				case 3:
					System.out.println("1.Cse\n2.Ece\n3.Me\n4.Exit");
					course=sc.nextInt();
					switch(course) {
					case 1:
						students[count]=new student(rank,"Cu","Cse");
						break;
					case 2:
						students[count]=new student(rank,"Cu","Ece");
						break;
					case 3:
						students[count]=new student(rank,"Cu","Me");
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
			int count1=0,student_admit=0;
			for(int i=0;i<total_students;i++) {
				
				if(students[i].college_name == "Ptu") {
					if(students[i].course_name == "Cse") {
						if(!(university_1.cse_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Ptu","Cse");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
						
					}
					else if(students[i].course_name == "Ece") {
						if(!(university_1.ece_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Ptu","Ece");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
					else if(students[i].course_name == "Me") {
						if(!(university_1.me_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Ptu","Me");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
				}
				else if(students[i].college_name == "Cgc") {
					if(students[i].course_name == "Cse") {
						if(!(university_2.cse_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cgc","Cse");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
						
					}
					else if(students[i].course_name == "Ece") {
						if(!(university_2.ece_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cgc","Ece");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
					else if(students[i].course_name == "Me") {
						if(!(university_2.me_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cgc","Me");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
				}
				else if(students[i].college_name == "Cu") {
					if(students[i].course_name == "Cse") {
						if(!(university_3.cse_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cu","Cse");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
					else if(students[i].course_name == "Ece") {
						if(!(university_3.ece_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cu","Ece");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
					else if(students[i].course_name == "Me") {
						if(!(university_3.me_decrease())) {
							remaining_students[count1]=new student(students[i].rank,"Cu","Me");
							count1++;
						}
						else {
							total_seats--;
							student_admit++;
						}
					}
				}
			}
			
			total_students=total_students-student_admit;
			System.out.println("These students haven't got the seats due to non-availability: ");
			for(int i=0;i<total_students;i++) {
				System.out.print(remaining_students[i].rank+" , ");
			}
			
		}	
	}
}	
