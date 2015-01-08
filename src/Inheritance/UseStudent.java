package Inheritance;

import java.util.Scanner;

public class UseStudent {
	
	public static void main(String[] args){
		
		System.out.println("Are you a Student or Faculty");
		Scanner in = new Scanner(System.in);
		String op1 = in.next();
		String sname = null;
		String sadd=null;
		String sid=null;
		String shighqual=null;
		String fname = null;
		String fadd=null;
		String fhighqual=null;
		String fid = null;
		double smarks=0,sphone=0,fphone=0;
		float fsal =0;
		
		if(op1.contentEquals("Student")){
			
			System.out.println("Fill in the Student Form");
			System.out.println("Enter your Name: ");
			sname= in.next();
			System.out.println("Enter your ID: ");
			sid = in.next();
			System.out.println("Enter your Address: ");
			sadd = in.next();
			System.out.println("Enter your Phone No.: ");
			sphone = in.nextDouble();
			System.out.println("Enter your Highest Qualification: ");
			shighqual = in.next();
			System.out.println("Enter your TotalMarks: ");
			smarks =in.nextDouble();
		
		}
		else{
			System.out.println("Fill in the Faculty Form");
			System.out.println("Enter your Name: ");
			fname= in.next();
			System.out.println("Enter your ID: ");
			fid = in.next();
			System.out.println("Enter your Address: ");
			fadd = in.next();
			System.out.println("Enter your Phone No.: ");
			fphone = in.nextDouble();
			System.out.println("Enter your Highest Qualification: ");
			fhighqual = in.next();
			System.out.println("Enter your Salary: ");
			fsal =in.nextFloat();
		}
		in.close();
		System.out.println(sname);
		Student sobj = new Student();
		//store data into object using setter methods
		if(op1.equalsIgnoreCase("student")){
		sobj.setName(sname);
		sobj.setAddress(sadd);
		sobj.setHighestQualification(shighqual);
		sobj.setId(sid);
		sobj.setPhone(sphone);
		sobj.setMarks(smarks);
		}
		else{
		sobj.setName(fname);
		sobj.setId(fid);
		sobj.setPhone(fphone);
		sobj.setSal(fsal);
		sobj.setAddress(fadd);
		sobj.setHighestQualification(fhighqual);
		}
		//retrieve data from the object using getter methods
		System.out.println(" Name: "+sobj.getName());
		System.out.println(" ID: "+sobj.getId());
		System.out.println(" Address: "+sobj.getAddress());
		System.out.println(" Highest Qualification: "+sobj.getHighestQualification());
		System.out.println(" Phone Number: "+sobj.getPhone());
		System.out.println(" Marks:"+sobj.getMarks());
		if(op1.contentEquals("Faculty"));
		System.out.println(" Salary :" +sobj.getSal());
		
	}

}
