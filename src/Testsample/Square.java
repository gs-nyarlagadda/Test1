package Testsample;

public class Square {
	
	public void printSquare(int x){
		
		System.out.println(x*x);
		
	}
	public static void main(String[] args){
		
		int value = 2;
		
		Square sq = new Square();// object instance creation and accessing the methods
		sq.printSquare(value);
		sq.printSquare(3);
		sq.printSquare(3*6);
		sq.printSquare(value*4);
	}

}
