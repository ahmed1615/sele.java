package dsoky_oop;

public class employee {
	 int emp_ID;
	 String name;
	String depart;
	double salary;
	double bonus;
	boolean resident;
	
	
	public employee(int i, String s, boolean b, String d, int j, int k){
		emp_ID=i;
		name=s;
		depart=d;
		salary=j;
		bonus=k;
		resident=b;
		}
	public employee(int idno, String n) {
		
		emp_ID=idno;
		name=n;
	}
public employee(int idno, String n,boolean r) {
		
		emp_ID=idno;
		name=n;
	
		resident=r;
		}

		
		
	

	
	public void print_data() {
		
		System.out.println("id "+emp_ID);
		System.out.println("name "+name);
		System.out.println("departament "+depart);
		System.out.println("salary "+salary);
		System.out.println("resedent "+resident);
		System.out.println("bounas "+bonus);
	}
	
	
	
}
