package Testsample;

import java.util.Scanner;
public class BestPerformer {
	
	public static void main(String[] args){
		
		System.out.println("Enter the 3 Participants Names :");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		String name1 = input1.next();
		String name2 = input2.next();
		String name3 = input3.next();
		
		System.out.println("Enter the time lap for "+ name1 + ":");
		Scanner timeinput1 = new Scanner(System.in);
		System.out.println("Enter the time lap for "+ name2 + ":");
		Scanner timeinput2 = new Scanner(System.in);
		System.out.println("Enter the time lap for "+ name3+ ":");
		Scanner timeinput3 = new Scanner(System.in);
		
		int timein1 = Integer.parseInt(timeinput1.next());
		int timein2 = Integer.parseInt(timeinput2.next());
		int timein3 = Integer.parseInt(timeinput3.next());
		
		if(timein1<timein2){
			
			if(timein1<timein3){
				
				System.out.println("The Best Performer is " + name1);
				
				if(timein3<timein2){
					System.out.println("The Second Best Performer is "+ name3);
				}
				else{
					System.out.println("The Second Best Performer is "+ name2);
				}
				
			}
			else{
				System.out.println("The Best Performer is "+ name3);
				
				System.out.println("The Second Best Performer is "+ name1);
			}
			
		}
		else{
				if(timein2<timein3){
					
					System.out.println("The Best Performer is "+ name2);
					
					if(timein3<timein1){
						System.out.println("The Second Best Performer is "+ name3);
					}
					else{
						System.out.println("The Second Best Performer is "+ name1);
					}
					
				}
				else{
					System.out.println("The Best Performer is "+ name3);
					System.out.println("The Second Best Performer is "+ name2);
				}
		}
		input1.close();
		input2.close();
		input3.close();
		timeinput1.close();
		timeinput2.close();
		timeinput3.close();
		
		
	}

}
