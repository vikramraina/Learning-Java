package singletonDemo;

public class DemoSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentSingleton singleton_obj = ParentSingleton.getinstance();
		singleton_obj.singleton_method();
	}

}
