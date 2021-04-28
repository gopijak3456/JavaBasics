package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Dynamic-Array ---ArrayList
		//1. Can contain duplicate value or elements
		//2. Maintains insertion order
		//3. Synchronized
		//4. allows random access to fetch the elements because it stores values on the basis of indexes
		
		ArrayList ar = new ArrayList();  //Defining ArrayList 
		
		ar.add(100);                     //Add()
		ar.add(200);
		ar.add("Gopi");
		System.out.println(ar.size());   //To print size of arrayList --size()

		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		ar.add(25.222);
		ar.add('M');
		System.out.println("Before Removal");
		System.out.println(ar.size());
		
		ar.remove(2);        					//Remove()
		System.out.println("After Removal");
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));             // To get value in an ArrayList by indexing ---get(index)
		//System.out.println(ar.get(9));  //IndexOutofBoundsException
		
		//TO print entire ArrayList :
		//For Loop --Because we can use indexing
		// Using Iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//To restrict ArrayList to particular datatype -- is called Generics
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		System.out.println(ar1.size());
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		//To restrict ArrayList to particular datatype
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Malla");
		ar2.add("Raju");
		ar2.add("Gopi1");
		System.out.println(ar2.size());
		
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
		
		//ArrayList<E> ar3 = new ArrayList<E>(); ---> Incase of generics is not defined and different datatypes need to be used
		
		// Using Iterator


	}

}
