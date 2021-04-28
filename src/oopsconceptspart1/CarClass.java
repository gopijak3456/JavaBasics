package oopsconceptspart1;

public class CarClass {
	
	//Class variables
	int model;
	int wheel;

	public static void main(String[] args) {
		// Class -->entity where we have to define the properties,number of methods and variables
		//variables and methods are characterstics of any particular class
		
		//How to create object of any class
			//new CarClass(); ==> This is object of CarClass
			// a,b,c---> are object reference variable
			// new --> operator or keyword is used to create a object
		
		// copy of variables model,wheel declared in CarClass will be given to below objects {which are referred using reference variables a,b,c}
		
		CarClass a = new CarClass();   
		CarClass b = new CarClass();
		CarClass c = new CarClass();
		
		//Initializing value to the variables
		
		a.model=2013;
		a.wheel = 4;
		
		b.model = 2015;
		b.wheel = 4;
		
		c.model = 2018;
		c.wheel = 4;
		
		System.out.println("Before assigning the references");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		//Shifting of object references from one object to another
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);//10
		c.model = 20;
		System.out.println(a.model);//20
		System.out.println(c.model);//20
		
	}

}
