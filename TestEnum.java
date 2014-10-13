
public class TestEnum {

	public static void main(String[] args) {
		Encapsulation encap_obj = new Encapsulation();
		encap_obj.set_name("Vikram");
		encap_obj.set_age(21);
		String name = encap_obj.get_name();
		int age = encap_obj.get_age();
		System.out.println(name);
		System.out.println(age);
		
	}

}
