package Converter.learning;


import java.io.IOException;
import java.util.Scanner;

/*
 * Program is a simple converter that converts temperature. Celsius to
 * Fahrenheit and oposite. 
 * Can write result to file
 * Version 3.5 
 */ 


public class Main {

	public static void main(String[] args) throws IOException {
		String s ;
		String path = null;
		ManipulatingFiles file = new ManipulatingFiles(path, true);
		UserInput input = new UserInput();
		Conversion conversion = new Conversion();
		System.out.println("To convert Celsius to Fahrenheit press C, To convert Fahrenheit to Celsius press F ");
		//Creating a scanner that enables conversion mode
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNext("[CF]")){
			System.out.println("wrong input, please enter C or F");
			scan.next();
			//mySet.add();
		}
		//mySet.add(s = scan.next());
		file.writeToFile(s = scan.next());
		switch(s){
		case "C":
			file.writeToFile("\nYou have chosed conversion from C to F");
			System.out.println("Conversion To Fahrenheit");
			conversion.convertToF(input.dataInput());
			//conversion.print();
			file.writeToFile(conversion.print());
			scan.close();
			break;
		case "F":
			file.writeToFile("\nYou have chosed conversion from F to C");
			System.out.println("Conversion To Celsius");
			conversion.convertToC(input.dataInput());
			//file.writeToFile(conversion.convertToC(input.dataInput()));
			//used for logging
			file.writeToFile(conversion.print());
			scan.close();
			
			break;
		default:
			break;
		}
		
		
		
		//input.dataInput();
		//System.out.println(input.temp);
		
	
		
	}

}
