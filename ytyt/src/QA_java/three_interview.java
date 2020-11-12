/*
 * you want to make one program  print hello like olleh
 */

package QA_java;

import java.util.Scanner;

public class three_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("put your word");
		Scanner input=new Scanner(System.in);
		String x= input.next();
		for(int i=x.length()-1;i>=0;i--) {
			System.out.print(x.charAt(i));
		}
		
			
		
	}

}
