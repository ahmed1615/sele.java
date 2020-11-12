/*
 * if u have array have some numbers and u want to sum all of them 
 */

package QA_java;

public class tow_inerview {

	public static void main(String[] args) {
		int array[]= {10,20,30};
		int sum=0;
		for(int i=0; i<array.length;i++) {
			sum=sum+array[i];
		}

		System.out.println(sum);
	}

}
