
public class Peacock extends Birds {
	
	void different_sounds() {
		System.out.println("All Birds have different sounds");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peacock peacock_obj = new Peacock();
		peacock_obj.different_sounds();
		peacock_obj.same_eating_habits();
	}
}