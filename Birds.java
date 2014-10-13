// Abstract methods are usually declared where two or more classes are expected to do
//	a similar thing in different ways through different implementation. These subclasses
//	extend the same abstract class and provide different implementation for the abstract methods
//
// If a class contains any abstract method then the class is declared as abstract class.
//	An abstract class can never be instantiated. Although it does not provide 100% abstraction as
//	it contains some concrete methods.
//	Methods that are declared without any body are called abstract methods. Method body is defined by
//	subclass. Any class that extends the abstract class must implement all the abstract methods declared
//	by super class. 
//	Abstract classes are different from interfaces. It can never be instantiated.
// 	An abstract class needs to have abstract method.
//	Abstract class can have constructors
//	Abstract method can never be final or static
abstract public class Birds {
	
	// Abstract method. Only need to be declared
	abstract void different_sounds();
	
	// Concrete method
	public void same_eating_habits() {
		System.out.println("All Birds have same eating habits");
	}
}