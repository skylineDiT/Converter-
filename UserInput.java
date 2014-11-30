package Converter.learning;

//This class handles user input


import java.util.Scanner;

public class UserInput {
	
	public UserInput(){
		//dataInput();
	}
	
	//declaring variables
	float temp;
	//Creating scanner for reading user input
	Scanner inputTemp= new Scanner(System.in);
	
	
	//Method that does handles input
	public float dataInput(){
		
		System.out.println("Enter a numer");
		/*
		if(inputTemp.hasNext("[A-Z]")){
			System.out.println("You have entered a letter. Please enter number!");
		}else{
			temp = inputTemp.nextFloat();
		}*/
		//Checking if an input is a float
		while (!inputTemp.hasNextFloat()){
			System.out.println("You have entered wrong type. Please enter number!");
			inputTemp.next();
		}
		temp = inputTemp.nextFloat();
		//Closing Scanner
		inputTemp.close();
		return temp ;
	}
	
	 

}
