/*
 * check the number is even or odd
 */

package QA_java;

import java.util.Scanner;

public class four_interview {

	public static void main(String[] args) {
		System.out.println("put your number");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		if(x%2==0) {
			System.out.println("this is number is even");
		}
		else {
			System.out.println("thisis number is odd");
		}

	}

}
