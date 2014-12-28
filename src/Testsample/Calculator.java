package Testsample;

import java.util.Scanner;

public class Calculator {
	
	public void calculate(){
		
		System.out.println("Enter the first input:");
		Scanner input1 = new Scanner(System.in);
		int n1 = input1.nextInt();
		
		System.out.println("Enter the second input:");
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		double result = 0;
		
		System.out.println("Choose any of the following Operations:");
		System.out.println(" + = Addition");
		System.out.println(" - = Subtraction");
		System.out.println(" * = Multiplication");
		System.out.println(" / = Division");
		
		Scanner input3 = new Scanner(System.in);
		String n3 = input3.next();
		
		input1.close();
		input2.close();
		input3.close();
		
		switch(n3){
		
		case "+" : result = n1+n2;
				   System.out.println(result);
				   break;
				   
		case "-" : result = n1-n2;
		           System.out.println(result);
		           break;
		           
		case "*" : result = n1*n2;
		           System.out.println(result);
		           break;
		           
		case "/" : result = n1/n2;
		            System.out.println(result);
		            break;
		
		}
	}
	public static void main(String[] args){
		
		Calculator calculator = new Calculator();
		calculator.calculate();
		
	}

}
