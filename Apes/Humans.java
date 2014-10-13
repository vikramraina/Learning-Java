// Packages are a grouping of related types (classes, interfaces, enumerations annotations).
// All are under package Apes. So 
//	java Apes/Humans or Apes.Humans will give the same input as below.
//
// Package statement should be the first one in file
// java.lang - bundles the fundamental classes
// java.io - classes for input / output functions

// There are three ways to access package from outside the package
// 	import package.*;
//	import package.classname;
//	fully qualified name;

package Apes;

public class Humans implements Ape {
	
	public void run() {
		System.out.println("Apes Run !!!");
	}
	
	public void walk() {
		System.out.println("Apes Walk !!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humans human_obj = new Humans();
		human_obj.run();
		human_obj.walk();
	}
}