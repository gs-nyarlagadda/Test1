package Testsample;

import java.util.Scanner;

public class Task3 {
	
	public void merge(){
		
		System.out.println("Enter the size of set1 : ");
		Scanner size1 = new Scanner(System.in);
		int s1=size1.nextInt();
		
		System.out.println("Enter the size of set1 : ");
		Scanner size2 = new Scanner(System.in);
		int s2=size2.nextInt();
	
		
		System.out.println("Enter the first array list : ");
		Scanner input1 = new Scanner(System.in);
		String in1 = input1.next();
		
		System .out.println("Enter the second array list : ");
		Scanner input2 = new Scanner(System.in);
		String in2 = input2.next();
		
		char[] set1 = new char[s1];
		char[] set2 = new char[s2];
		char[] result= new char[set1.length+set2.length];
		int k = 0;
		
		set1 = in1.toCharArray();
		set2 = in2.toCharArray();
		
		input1.close();
		input2.close();
		
		size1.close();
		size2.close();
	
		//checks for duplicate values in the arrays
		for(int i=0; i<set1.length;i++){
			
			for(int j=0;j<set2.length;j++){
				if(set1[i]==set2[j]){
					
					set2[j] = ' ';
//					System.out.println(set1[i]+"==equal=="+set2[j]);
					
				}
				else{
//					System.out.println(set1[i]+"==not equal=="+set2[j]);
				}
				
			}
		}
		//merges the above two arrays into a single array
		for(int i=0;i<set1.length;i++){
			
			result[k] = set1[i];
			k++;
		}
		for(int i=0;i<set2.length;i++){
			
			if(set2[i]!= ' '){
				
				result[k] = set2[i];
				k++;
			}
		}
		// end result array
		System.out.println(result);
		
	}

	
	public static void main(String[] args){
	
		
		Task3 task3=new Task3();
		task3.merge();
		
	}
}
