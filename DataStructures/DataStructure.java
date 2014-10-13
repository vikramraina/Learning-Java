// The enumeration interface defines the methods by which you can enumerate (obtain one at a time)
//	the elements in the collection of objects.
//
// Vector implements a dynamic array. It is same as array list. Vector provides 
//	very useful in case you don't know the size of the array in advance and can change during the 
//	lifetime of the program.
//
//	Bitset creates a special type of array that holds bit values. It can increase in size as 
//	needed
//
//	Stack is a sub class of vector that implements standard last in first out.
//
// Dictionary is an abstract class that defines a data structure for mapping keys to values
//
// The Hashable class provides a means of organizing the data based on some user defined key 
//	structure
//	The third version creates a hash table that has an initial size specified by size 
//	and a fill ratio specified by fillRatio. This ratio must be between 0.0 and 1.0, 
//	and it determines how full the hash table can be before it is resized upward.
//
// Properties is a subclass of Hashtable. It is used to maintain lists of values where
//	key is a string and value is also a string	


package DataStructures;

import java.util.Vector;
import java.util.Enumeration;
import java.util.BitSet;
import java.util.Stack;
import java.util.Hashtable;
import java.util.Properties;
import java.util.*;
import java.util.HashMap;

public class DataStructure {
	
	public static void main(String[] args) {
		
		Vector vec_obj = new Vector();
		vec_obj.addElement("Sunday");
		vec_obj.addElement("Monday");
		vec_obj.addElement("Tuesday");
		vec_obj.addElement("Wednesday");
		vec_obj.addElement("Thrusday");
		vec_obj.addElement("Friday");
		vec_obj.addElement("Saturday");
		
		Enumeration days = vec_obj.elements();
		
		while (days.hasMoreElements()) {
			System.out.println("Name of Day is::" + days.nextElement());
		}
		
		Stack stack_obj = new Stack();
		stack_obj.push(4);
		stack_obj.push(3);
		stack_obj.push(2);
		stack_obj.push(1);
		
		System.out.println("Stack after items are pushed===>" + stack_obj);
		
		stack_obj.pop();
		System.out.println("Stack after popping first element===>" + stack_obj);
		
		
		Hashtable hash_obj = new Hashtable();
		hash_obj.put("Vikram", "Raina");
		hash_obj.put("Vicky", "Rajuina");
		hash_obj.put("Vicky", "Rajuina");
		hash_obj.put("Deeps", "Deepshikha");
		hash_obj.put("Raina", "Koul");
		
		Enumeration enu_names = hash_obj.keys();
		
		while (enu_names.hasMoreElements()) {
			System.out.println("Names::" + enu_names.nextElement());
		}
		
		Properties pro_obj = new Properties();
		
		pro_obj.put("India", "Delhi");
		pro_obj.put("CA", "Sacramento");
		
		Set pro_obj_keyset = pro_obj.keySet();
		System.out.println(pro_obj_keyset);
		
		System.out.println(pro_obj.getProperty("CA"));
		
		// HashMap is unsynchronized. Order can change over time and it permits null values
		//	A map contains values based on the key i.e. key and value pair.
		//	Each pair is known as an entry.Map contains only unique elements.
		//	What is difference between HashMap and Hashtable?
		//		1) HashMap is not synchronized.	Hashtable is synchronized.
		//		2) HashMap can contain one null key and multiple null values.	
		//			Hashtable cannot contain any null key nor value.
		
		// Hashtable is synchronized, which means Hashtable is thread-safe and 
		//	can be shared between multiple threads but HashMap cannot be shared between 
		//	multiple threads without proper synchronization.
		
		//	What is difference between HashSet and HashMap?
		//		HashSet contains only values whereas HashMap contains entry(key and value).
		
		Map hashmap_obj = new HashMap();
		hashmap_obj.put("Vikram", "Raina");
		hashmap_obj.put("Deepshikha", "Koul");
		hashmap_obj.put("Deepshikha", "Koul");
		hashmap_obj.put("Romeo", "Raina");
		
		System.out.println(hashmap_obj);
		
		// ArrayList
		ArrayList arraylist_obj = new ArrayList();
		arraylist_obj.add(4);
		arraylist_obj.add(3);
		arraylist_obj.add(2);
		arraylist_obj.add(1);
		arraylist_obj.add(0);
		
		// Iterator to iterate over the objects
		Iterator itr_obj = arraylist_obj.iterator();
		
		while (itr_obj.hasNext()) {
			System.out.println(itr_obj.next());
		}
		
		// Sorting an arraylist using Collections
		System.out.println(arraylist_obj);
		Collections.sort(arraylist_obj);
		System.out.println(arraylist_obj);
		
		// Difference between list and set is list can contain duplicate elements where
		//	as set contains only unique elements
		
		// TreeSet contains unique elements only like HashSet. 
		//	The TreeSet class implements NavigableSet interface that extends 
		//	the SortedSet interface. It maintains ascending order.
	}
}