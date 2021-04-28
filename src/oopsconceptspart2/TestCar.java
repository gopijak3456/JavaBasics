package oopsconceptspart2;

public class TestCar {

	public static void main(String[] args) {
		//Whenever a same method is present in both(parent and child) classes with same name and same no.of arguments-The preference will be given to child class method
		//Extends allows Child class to access all the methods available in parent class
		
		//Static Polymorphism --Compile time Polymorphism gives access to all the methods of child and parent class
		//Polymorphism --> one to many
		BMW obj = new BMW();
		obj.start();  // child class overridden start() method
		obj.stop();
		obj.refuel();
		obj.start();
		obj.theftsafety();  //Method of BMW
		obj.engine();       // Method of Vehicle
		
		System.out.println("************");
		
		Car c =new Car();
		c.start();
		c.stop();
		c.refuel();
//		c.thefsafety();  //Car(parent) class can't access any methods of the BMW(child) class
		
		System.out.println("************");
		
		// Top Casting -- Moving small(BMW) thing to Big(Car) thing or child can be fit into parent
		
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable--Dynamic or Run-Time Polymorphism
		//Only Parent class methods and overridden methods can be called in Dynamic Poly'sm
		c1.start();
		c1.stop();
		c1.refuel(); 
		//c1.theftsafety(); // Not possible as its a method of BMW(Child) class.
		
		// Down Casting -- Moving Big(Car) thing to Small(Child) thing  --- or Parent can't be fit into Child 
		
		// BMW b1 = new Car();   //Not possible
		BMW b1 = (BMW)new Car();  //Down Casting is possible but at run time throws --- ClassCastException error
	}

}
