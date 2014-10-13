import java.io.*;

public class MyFirstClass {
	// Class Variable
	int age;
	
	// Constructor
	public MyFirstClass(String name_of_class) {
		System.out.println("Passed Name of Class is::" + name_of_class); 
	}
	
	// Set age of class
	public void set_age(int obj_age) {
		age = obj_age;
	}
	
	public int get_age() {
		System.out.println("Age set is::" + age);
		return age;
	}
	
	// Methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Mr. Vikram Raina");
		MyFirstClass myclass_obj = new MyFirstClass("Raina");
		
		// Set age of class
		myclass_obj.set_age(7);
		
		// Get age of class
		myclass_obj.get_age();
		
		// Get age from the instance variable
		System.out.println("Age of class got from the instance variable::" + myclass_obj.age);
	}

}
