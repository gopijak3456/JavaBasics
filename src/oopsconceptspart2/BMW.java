package oopsconceptspart2;

public class BMW extends Car{ //"Has a relationship" and  //Child Class to Car
	
	// To create relationship between two classes --Use extends
	//Whenever a same method is present in both(parent and child) classes with same name and same no.of arguments-(Method Overriding)
	//The preference will be given to child class method
	
	public void start() {   //Overridden method
		System.out.println("BMW....Start");
	}
	public void theftsafety() {
		System.out.println("BMW....Theftsafety");
	}

}
