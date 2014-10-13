package Examples;

import java.util.*;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar = generateArrayList(10000000);
		remDuplicates1(ar);
		remDuplicates2(ar);
	}
	
	public static ArrayList<String> generateArrayList (int num){
		ArrayList<String> dup_fruits = new ArrayList<String>();
		dup_fruits.add("Orange");
		dup_fruits.add("Apple");
		dup_fruits.add("Orange");
		dup_fruits.add("Pineapple");
		for( int i =0 ; i < num ; i++){
			dup_fruits.add("PineNut");
		}
		dup_fruits.add("Orange");
		dup_fruits.add("Apple");
		dup_fruits.add("Orange");
		
		//System.out.println("Before Removing duplicate elements:" + dup_fruits);
		return dup_fruits;
		
	}
	public static void remDuplicates2( ArrayList ar){
		long stime = System.currentTimeMillis();
		ArrayList br = new ArrayList ();
		
		for ( int i =0 ; i < ar.size() ; i++){
			String s = (String) ar.get(i);
			if( !br.contains(s)){
				br.add(s);
			}
		}
		long etime = System.currentTimeMillis();
		System.out.println( br);
		System.out.println( etime - stime);
	}
	
	
	public static void remDuplicates1 ( ArrayList ar){
		long stime = System.currentTimeMillis();
		HashSet fruits = new HashSet();
		//LinkedHashSet sorted_fruits = new LinkedHashSet();
		fruits.addAll(ar);
		//sorted_fruits.addAll(ar);
		
		long etime = System.currentTimeMillis();
		System.out.println( fruits);
		System.out.println( etime - stime);
		
		
		
		
		
	}
}
