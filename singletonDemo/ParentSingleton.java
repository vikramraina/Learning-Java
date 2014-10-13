//	The Singleton's purpose is to control object creation, limiting the number of objects
//		to one only. Since there is only one Singleton instance, any instance fields of a 
//		Singleton will occur only once per class, just like static fields. 
//		Singletons often control access to resources such as database connections or sockets.

package singletonDemo;

public class ParentSingleton {
	
	// Create a singleton object 
	public static ParentSingleton singleton = new ParentSingleton();
	
	// Making constructor private for singleton
	private ParentSingleton() {};
	
	public static ParentSingleton getinstance() {
		return singleton;
	}
	
	public void singleton_method() {
		System.out.println("Method for Singleton ***");
	}
}
