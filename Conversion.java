package Converter.learning;

//This class converts C to F and vice versa

public class Conversion {
	//declaring variables
	float result; 
	float C;
	float F;
	//Constructor
	public Conversion(){
		//convertToC(F);
		//convertToF(C);
		//print();
		
	}
	//Method that does conversion from C to F 
	public float convertToF (float C){
		return result = C * 9/5 + 32;
	}
	
	//Method that does conversion from F to C 
		public float convertToC (float F){
			return result = (F - 32) * 5/9;
		}
		
		public String print(){
			 System.out.println("Result is: " + result);
			 return "\nResult is: " + result;
		}
		
}
