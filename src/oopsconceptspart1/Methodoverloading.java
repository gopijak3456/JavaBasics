package oopsconceptspart1;

public class Methodoverloading {

	public static void main(String[] args) {
	

		Methodoverloading obj =new Methodoverloading();  //object creation
		obj.sum();
		obj.sum(5);     // a
		obj.sum(98.00); //d
		obj.sum("Mall");  // String K
		obj.sum("gopi", "single");  //Strings m+n
		

	}
	
	// Can we overload Main Method??  Yess
	
	public static void main(int a) {
		
	}
	
	public static void main(int a,int b) {
		
	}
	
	
//Duplicate Methods --> Same method name with same number of arguments/parameters are not allowed
//Method Overloading --> When the method name is same with different type of arguments and same no of parameters 
	
	public void sum(int a) {   //  (Same Method with one input parameter 
		System.out.println("Sum Method1");
		System.out.println(a);
	}
	
	public void sum(double d) {   //  (Same Method  with different argument but same no of parameters
		System.out.println("Double Sum Method1");
		System.out.println(d);
	}

//	(or)
	
//different number of input parameters for same arguments within the same class
	
	
	public void sum() {       //  (Same Method with zero input parameter)
		System.out.println("sum Method with zero input Parameter");
	}
	
	public void sum(String k) {     //  Same Method with one input parameters  of argument type String
		System.out.println("Method Strring 1");
		System.out.println(k);
	}
	
	public void sum(String m, String n) {     //  Similarly Same Method with multiple parameters and same argument/data type
		System.out.println("Method Strings");
		System.out.println(m+n);
	}
	

	// We cannot create a method inside a method (Ex: Nike factory inside Reebok Factory is not accepted)
	// Duplicate methods are not allowed.
	//Methods are independent to each other
	

}
