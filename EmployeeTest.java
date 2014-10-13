import java.io.*;
import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Vikram Raina");
		Employee emp2 = new Employee("Romeo");
		
		// Setting/Invoking the methods
		emp1.set_age(27);
		emp1.set_designation("CEO");
		emp1.set_salary(5000000);
		
		emp2.set_age(30);
		emp2.set_designation("Software Engg");
		emp2.set_salary(700000);
		
		// Print Employee Details
		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		System.out.println("*****");
		System.out.println("**Testing the private / public variables**");
		System.out.println("Public Age::" + emp1.age);
		// As Salary is private it is not visible
		//System.out.println("Private Salary::" + emp1.salary);
		System.out.println("Public Designation::" + emp1.designation);
		System.out.println("*****");
		
		// Testing static variables
		System.out.println("*****");
		System.out.println("**Testing the class static variables**");
		System.out.println("Public static final Department is::" + Employee.DEPARTMENT);
		
		// As Salary is private static so it is not visible
		//System.out.println("Private Salary::" + Employee.dept_salary);
		System.out.println("*****");
		
		// Ternary operator
		int a = 10; int b;
		b = (a == 10) ? 70: 100;
		System.out.println("Value of a::" + b);
		
		// Checking instance of Class
		boolean check_instance = emp1 instanceof Employee;
		System.out.println("Instance of Class::" + check_instance);
		
		// While loop
		int c = 1;
		while(c<8) {
			System.out.println("Hello *" + c);
			c++;
		}
		
		// do wile loop
		int d = 1;
		do {
			System.out.println("Hi *" + d);
			d++;
		}while(d<1);
	
		// for loop
		for(int e=1; e<5; e++) {
			// Using Break
			if (e==2) break;
			
			System.out.println("For *" + e);
		}
	
		// Enhanced for loop; Mainly used for arrays
		String[] names = {"Vikram", "Raina", "Romeo", "Juliet"};
		for (String name: names) {
			//Using continue
			if (name=="Romeo") continue;
			System.out.println("Hello::" + name);
		}
		
		int x=0; int y=0;
		// if else
		if (x==10) {
			// Condition met
		}else if (y == 20) {
			// Based on condition
		}else {
			// It will go else if nothing met
		}
		
		// Arrays
		double[] myList = new double[10];
		emp1.get_array(new int [] {1,2,3,4});
		String type_class = emp1.return_array(new int [] {4,3,2,1});
		System.out.println("Type of String::" + type_class);
		
		// Date 
		Date date = new Date();
		System.out.println("Current Date::" + date.toString());
	}
}
