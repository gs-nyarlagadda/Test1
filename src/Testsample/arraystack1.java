package Testsample;

import java.util.Scanner;

public class arraystack1 {
	
			public static void main(String args[]){
			
			Scanner input = new Scanner(System.in);
			String[] answer = new String[4];
			String[] exam = new String[4];
			int result=0;
			int total=0;
			
			
			for(int i=0; i<=3; i++){
				
				System.out.println("Enter markskey: ");
				answer[i] = input.next();
				
			}
			for(int i=0; i<=3; i++){
				
				System.out.println("Enter examkeys: ");
				exam[i] = input.next();
				
			}
			input.close();
			for(int i=0;i<=3;i++){
				
				if(exam[i].equalsIgnoreCase("?")){
					
					result = 0;
				}
				else{
					
					if(answer[i].equals(exam[i])){
						
						result = 4;
					}
					else{
						result = -1;
					}
				}
				total = result+total;
			}
			
			System.out.println("Total Marks = "+ total);
			
		}

	}


