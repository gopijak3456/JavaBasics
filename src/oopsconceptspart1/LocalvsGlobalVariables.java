package oopsconceptspart1;

public class LocalvsGlobalVariables {

	//Global variables or Class variables --> can be used through out the class/program--->But how? through object
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10; //Local variable --Can be used only within the main method
		System.out.println(i);
		
		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		//System.out.println(name);   // Throws error as we are calling global variable directly without reference of a object
		
	}
	
	public void sum() {
		int i =20;   //i,j and age are Local variables And can be used only within the sum method
		int j =10;
		System.out.println(i);
		System.out.println(j);
		
	}

}
