// Child class for vehicle
// We cannot use both this() and super() in a constructor as both need to be the 
// first statement in the constuctor

// The benefit of overriding is ability to define a behaviour that is specific to the subclass which
//	means that a  sub class can implement parent class method based on its requirement

// Static binding in Java occurs at the compile time where as dymanic binding occurs 
// during run time. Static binding uses type(class) information for binding where as dynamic binding 
// uses instance of class (Object) to resolve calling of method at run time. Overloaded methods are 
// bonded using static bonding where as overridden methods are bonded using dynamic binding.

import Apes.*;

public class Car extends Vehicle {
	
	String car_name="CHILD VEHICLE";
	
	// Overriding the parent class method
	public void desc() {
		// Use super keyword to override the methods of parent class or refer the parent class
		super.desc();
		System.out.println("In Child Method");
		super.car_name="PARENT VEHICLE";
		System.out.println(super.car_name);
	}
	
	public static void main(String[] args) {
		Car car_obj = new Car();
		car_obj.desc();
		
		// For the Dynamic Polymorphism car1_obj is of Vehicle type but 
		// 	only at run time method of car object is called which is also
		//	known as dynamic binding
		Vehicle car1_obj = new Car();
		car1_obj.desc();
		System.out.println(car_obj.car_name);
		
		// Using fully qualified name to access package from another package
		Apes.Humans human_obj = new Humans();
		human_obj.run();
		human_obj.walk();
	}
}