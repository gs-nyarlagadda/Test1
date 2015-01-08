package Inheritance;

public class Student extends Faculty{
	
	//instance variable
	double marks;
	
	//setter method to store marks
	void setMarks(double mark){
		
		this.marks = mark;
	}
	
    //getter method to retrieve marks
    double getMarks(){
    	
    	return marks;
    }
	
}
