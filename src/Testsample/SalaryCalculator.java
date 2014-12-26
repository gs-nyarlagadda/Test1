package Testsample;

import java.util.Scanner;

public class SalaryCalculator {
	
	public static void wage(int workingdays){
		
		int minwage = 8;
		int basepay = minwage*workingdays;
		int y=0;
		if(workingdays>40){
			
			 y = workingdays-40;
		}
		double overtime = y*basepay*1.5;
		System.out.println("Salary = "+ overtime);
		
	}
	
	public static void main(String[] args){
		
		System.out.println("Enter Number of working Days");
		
		Scanner input = new Scanner(System.in);
		int workingdays = Integer.parseInt(input.next());
		input.close();
		
		if(workingdays<40 || workingdays>=60){
			
			System.out.println("Range of Working Hours Varies from 40 to 60");
		}
		else{
			wage(workingdays);
		}
		
	}

}