package Testsample;

public class DoMath2 {
	
	public static void main(String[] args){
		
		double score = 1.0 + 2.0 * 3.0;
		System.out.println(score);
		int copy = (int) score;// type casting from double to integer
		copy = copy/2;
		System.out.println(score);
		System.out.println(copy);
		
	}

}
