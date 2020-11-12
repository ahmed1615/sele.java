/*
 * write a program check the maximum value in this array
 */

package QA_java;

public class five_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {20,30,80,40,50,60};
		int a=array[1];
		for(int i=0; i<array.length;i++) {
			 if(array[i]>a)
				 a=array[i];
		}
		System.out.println("the greates value is "+ a);
	}

}
