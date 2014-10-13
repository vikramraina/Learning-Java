// Encapsulation is a process of wrapping the code and data together. It is a technique 
//	of making the fields in class as private and providing access to fields via public methods.
// We can create encapsulated class by making the data members as private. Then we can use 
//	getters and setters to access the data in it.
public class Encapsulation {
	private String name;
	private int age;
	
	public String get_name() {
		return name;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public int get_age() {
		return age;
	}
	
	public void set_age(int age) {
		this.age = age;
	}
}