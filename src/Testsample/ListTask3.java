package Testsample;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class ListTask3 {
	
	public static void main(String[] args){
		
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<String>();
		//List<String> lst = new ArrayList<String>();
		
		Set<String>  set = new HashSet<String>();
		
		System.out.println("Enter inputs: ");
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		String a = input1.next();
		lst1.add(a);
		String b = input2.next();
		lst2.add(b);
		
		input1.close();
		input2.close();
		
		for(String x:lst1){
			
			set.add(x);
			
		}
		for(String y:lst2){
		 
			if(!lst1.contains(y)){
				
				set.add(y);
				
			}
		}
		System.out.println("The Output = "+ set);
		
	}

}
