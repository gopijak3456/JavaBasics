package oopsconceptspart1;

public class Static_Nonstatic {

	// global var --Scope of global variables will be available across all the functions with some conditions
	String name ="Tom";   //Non static global var
	static int age = 25;  //static global var
	
	public static void main(String[] args) {
		
		//How to call static methods and variables?
		//1. DIrect calling
		sum();
		//2.Calling by calss Name:
		Static_Nonstatic.sum();

		System.out.println(age);
		System.out.println(Static_Nonstatic.age);
		
		//How to call non static methods and variables??
		//Non static variable or methods can only be accessed through object
		Static_Nonstatic obj = new Static_Nonstatic();
		obj.sendmail();
		System.out.println(obj.name);
		
		//Can I access static methods using object reference in Java?Yes
		obj.sum();  // warning--The static method sum() from the type Static_Nonstatic should be accessed in a static way
		System.out.println(obj.age);
	}

	
	public void sendmail() {
		System.out.println("Send Mail Method");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}
}
