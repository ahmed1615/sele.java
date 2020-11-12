/*
 * write one program search into array the value which will put the user 
 * if it will be into this array print it´s OK else print its not OK 
 */


package QA_java;

import java.util.Scanner;

public class one_interview {

	public static void main(String[] args) {
		System.out.println("the array values are 1,2,3,4,5");
		System.out.println("please insert your value you want to serach for");
		Scanner input =new Scanner(System.in);
		int x= input.nextInt();
		int array[]= {1,2,3,4,5};
		String result="its not ok";
		for(int i=0;i<array.length;i++) {
			if(x==array[i])
				result="it is ok ";
		}
   System.out.println(result);
}
}