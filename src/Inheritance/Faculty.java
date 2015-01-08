package Inheritance;

public class Faculty {
	
	//instance variables
	private String name1;
	String id;
	String address;
	float sal;
	String highqual;
	double phone;
	
	//setter method to store name
	public void setName(String name){
		
		this.name1 = name;
	System.out.println(name1);
	}
	
	// getter method to retrieve name
	public String getName(){
		System.out.println(name1+"ddddd");
		return name1;
					
	}
	
	//setter method to store id
	void setId(String id1){
		
		id = id1;
	}
	
	//getter method to retrieve id
	String getId(){
		return id;
	}
	
	//setter method to store address
	void setAddress(String address1){
		
		address = address1;
	}
	
	//getter method to retrieve address
	String getAddress(){
		
		return address;
	}
	
	//setter method to store salary
	void setSal(float sal){
		
		this.sal = sal;
	}
	
	//getter method to retrieve salary
	float getSal(){
		return sal;
	}
		
	//getter method to retrieve highqual
	String getHighestQualification(){
		return highqual;
	}
	
	//setter method to store highqual
	void setHighestQualification(String highestqual){
		
		this.highqual = highestqual;
	}
	
	//getter method to retrieve phone
	double getPhone(){
		
		return phone;
	}
	
	//setter method to store phone
	void setPhone(double phoneno){
		
		this.phone = phoneno;
	}
		
}
