package dsoky_oop;

public class car {
	
	private String maker;
	private int model;
	
	
	
	
public car() {
	
	maker="honda";
	model=2018;
	
}

public car(String mk, int mo) {
	maker=mk;
	model=mo;
}
	 public void Setmaker(String m) {
		
		 if(m=="toyota"||m=="ford"||m=="fiat")
			 {m=maker;
			 }
		 else {
			 System.out.println("no hay esas aoutos yaba");
		 }
			 }
	 
	public void  Setmodel(int year) {
		
		if (year>2010)
	   model=year;
	}
	 
	 public String Getmaker() {
		 return maker;
	 }
	 public int Getmodel() {
		 return model;
	 }
	 
//constructors  dah awl ma astad3y el class lazem y7sl ely howa awl ma a3mlo call yshta4l
	 //3alatool  (aoutomaticly done)
	 //1-esmo zy esm el class
	 //2-mabyt7dtsh 2blaha no3
	 //3-alwyas it will be public. resumn es deafult
	 
}
