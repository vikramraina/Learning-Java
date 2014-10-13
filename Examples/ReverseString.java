package Examples;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String to_be_reversed = "My Name is Mr. Fox";
		
		// To use without for loop
		StringBuilder test = new StringBuilder();
		
		System.out.println("Original String is::\n" + to_be_reversed);
		
		String[] elements = to_be_reversed.split(" ");
		
		String reverse_string="";
		String reverse_element="";
		Stack reverse_str_stack = new Stack();
		
		// Using Stack
		for (int i = 0; i<elements.length; i++) {
			reverse_str_stack.push(elements[i]);
		}
		
		for (int i = 0; i<elements.length; i++) {
			reverse_element = (String) reverse_str_stack.pop();
			reverse_string = reverse_string.concat(reverse_element);
			reverse_string = reverse_string.concat(" ");
		}
		
		System.out.println("\n");
		System.out.println("Reversed String is::\n" + reverse_string);
		
		// Using normal method
//		for (int i = elements.length-1; i>=0; i--) {
//			reverse_string = reverse_string.concat(elements[i].toString());
//			reverse_string = reverse_string.concat(" ");
//		}
		
//		System.out.println("\n");
//		System.out.println("Reversed String is::\n" + reverse_string);
	}

}
