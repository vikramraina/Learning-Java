// Polymorphism means a state of having many shapes or capacity to take
//	different forms. Polymorphism in Java has 2 types:
//	Compile time polymorphism (static binding) as example below and run
//	time polymorphism also called dynamic binding. Method overloading is an
//	example of static binding and method overriding is an example of 
//	dynamic polymorphism.

public class Sum extends SumFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum_obj = new Sum();
		System.out.println(sum_obj.add(1,1));
		System.out.println(sum_obj.add(1,1,1));
		System.out.println(sum_obj.add(2,2.5));
		System.out.println(sum_obj.add(2.5,3));
	}
}
