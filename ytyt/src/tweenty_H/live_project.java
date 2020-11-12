
package tweenty_H;

import java.util.Scanner;

public class live_project {
	static int salary=25000;
	static int cridet=700;
	Scanner input=new Scanner(System.in);

	public static void main (String[]args) {
	
		
		Scanner input =new Scanner(System.in);
		String grade= input.nextLine();
		String massage;
		switch(grade) {
		case "A":
			System.out.println("sghshugs");
			break;
		case"B":
			massage="good one";
			break;
		case "C":
			massage="it is ok";
		    break;
		case "D":
			massage="eshta kda ";
			break;
		default:
			massage="hfdijshfjs";
			break;
		
		}
		Scanner nombre=new Scanner(System.in);
		System.out.println("enter your name: ");
		String name =nombre.next();
		Ehdah(name);
	}
		public static void Ehdah(String name) {
			System.out.println("welcome "+name);		
		
		} 

		{	
		double s=getsalary(); 
		int c=Getcridet();
		IsUsrco(s,c);
		
		input.close();
		}
		
	
	public static int Getcridet() {
		Scanner input=new Scanner(System.in);
		System.out.println("please put your cridet");
		int cri=input.nextInt();
		return cri;
	}
	public static double getsalary() {
		System.out.println("please put your salary");
		Scanner input=new Scanner(System.in);
		double sal=input.nextInt();
		return sal;
	}
	
	
	
	
		public static boolean IsUsrco(double sal,int cri) {
			if (sal>=salary&&cri>=cridet) {
				
				
			
			return true;
		}
			else {
				return false;
			}
		}
		
		
		
	}
		