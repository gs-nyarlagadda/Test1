package Testsample;

public class InnerFor {
	
	public static void main(String[] args){
		
		for(int i=1; i<=3; i++){
			
			System.out.print(i); // this loop executes for 3 times
			
			for(int j=1; j<=5; j++){
				
				System.out.println(j); // this loop executes for 15 times
			}
		}
	}

}
