package Testsample;

public class CrossCheck {
	
	public static void main(String[] arguments){
		
		System.out.println(arguments.length);
		System.out.println(arguments[0]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		System.out.println(arguments[1]);
	}

}
