import java.io.*;

public class Employee {
	// Declaring class variables / static variables
	public static final String DEPARTMENT="Information Technology";  
		
	private static int dept_salary = 100000;
	
	// Instance variables
	String name;
	
	// public is used so that it is visible to the child class
	public int age;
	public String designation;
	
	// private is used so that this is accessible to  this class only
	private int salary;
	
	// Constructor for Employee
	public Employee(String obj_name) {
		this.name = obj_name;
	}
	
	// Assign age
	public void set_age(int obj_age) {
		// local variable
		int local_age = 10;
		
		// Adding local variable
		age = obj_age + local_age;
	}

	// Assign Designation
	public void set_designation(String obj_designation) {
		designation = obj_designation;
	}
	
	// Assign Salary
	public void set_salary(int obj_salary) {
		salary = obj_salary;
	}
	
	// Print Employee Details
	public void printEmployeeDetails() {
		System.out.println("Name::" + name);
		System.out.println("Age::" + age);
		System.out.println("Designation::" + designation);
		System.out.println("Salary::" + salary);
	}
	
	// Array of numbers
	public void get_array(int [] local_array) {
		for (int i=0; i<local_array.length; i++)
		System.out.println("Hi::" + local_array[i]);
	}
	
	// Returning an array
	public String return_array(int [] local_return_array) {
		String string_array;
		string_array = local_return_array.toString();
		return string_array;
	}
	// Scanner or console is used to get i/p from user
	// Finalize method to run before garbage collecting e.g closing any open files
	protected void finalize() {
		
	}
}
