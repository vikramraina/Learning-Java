// Interfaces are pure abstract classes. You cannot create an instance of an interface
// Interfaces are used to achieve abstraction in Java. When we create an interface it tells 
// what a class can do without defining how it will do it
// Rules:
// Methods inside interface cannot be static, final, native or strictfp
// All methods declared inside Java interfaces are public and abstract even if you don't use 
//  abstract or final keyword
// Interface can extend to one or more interfaces
// Interface cannot implement a class
// Interface can be nested inside another interface
// Interface is a pure abstract class which starts with interface keyword
// Interface contains all abstract methods and final variable declarations
// Interfaces are useful in situations that all properties should be implemented

public class Tyre implements Moveable, Rollable {
	
	public boolean move() {
		System.out.println("Move Speed is::" + MOVE_SPEED);
		return true;
	}
	
	public boolean roll() {
		System.out.println("Roll Speed is::" + ROLL_SPEED);
		return true;
	}
	
	public static void main(String[] args) {
		Tyre tyre_obj = new Tyre();
		System.out.println(tyre_obj.move());
		System.out.println(tyre_obj.roll());
		
		
	}

}
