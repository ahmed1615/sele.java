package dsoky_oop;

//import java.util.Scanner;

public class rakm_wa7d {	
		private double length;
		private double width;
		
		
public rakm_wa7d() {
	System.out.println("a new room created with 10*15");
	length=10;width=15;
}	
public rakm_wa7d(double l, double w) {
	length=l; width=w;
	
}
		
		public void setlegth(double l) {
			length=l;	
		}
		public void setwidth(double w) {
			width=w;
		}
		public double getlength() {
			return length;
		}
		public double getlwidth() {
			return width;
		}
		public double geterea() {
			return (length*width);
		}

		
	
	
	

}
