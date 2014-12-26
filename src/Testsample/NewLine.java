package Testsample;

public class NewLine {
	
	public static  void newLine(){
		
		System.out.println("");
	}
	public static void threeLines(){
		
		newLine();
		//newLine();
		System.out.println("My Middile Line");
		newLine();
	}
	public static void main(String[] args){
		
		System.out.println("My First Line");
		threeLines();
		System.out.println("My Second Line After Calling The Methods");
	}
}
