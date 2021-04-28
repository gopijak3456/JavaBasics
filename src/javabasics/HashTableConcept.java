package javabasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "All!");
		
		System.out.println(h.size());
		
		h.put(1, 25);
		h.put(2, 50);
		
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		h.put(3, "Tom");
		
		//how to print Hash Table?
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 5);
		h1.put(2, 55);
		System.out.println(h1.size());
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(1, "A");
		h2.put(2, "B");
		System.out.println(h2.size());

	}

}
