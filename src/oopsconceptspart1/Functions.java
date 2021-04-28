package oopsconceptspart1;

public class Functions {

	//Main method ==> starting point of execution
	public static void main(String[] args) {                 //why main method is static??
		
		//To call not static methods written outside main method --A object need to be created
		
		Functions obj = new Functions();  // this line will create a new object;obj is object reference variable referring to object
		
		//After creating object,the copy of all info/code in non static methods will be given to this object and we just need to call those methods like below
		//syntax : objectrefvar.nonstaticmethod_name() 
		//ex: gopi.run(); gopi.sleep() -->Here gopi-objrefvar and run,sleep are non static methods
		// Note: Objects cannot hold static methods
		
		//calling method test()
		obj.test();
		
		//calling method pqr()
		int res= obj.pqr();
		System.out.println(res);
		
		//calling method qa()
		String s1=obj.qa();
		System.out.println(s1);
		
		//calling method divison()
		int divres=obj.divison(50, 10);
		System.out.println(divres);
		
	}
	
	// Functions and Methods are same
	//Non static Methods -3 types
	
	public void test(){                              // no input, no output
		System.out.println("Test method");
		//void ==> Does not return any value
		//return type ==> void
	}
	
	public int pqr() {                               // no input, some output
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
		//return type ==> int --returns value of type integer
	}
	
	public String qa() {                             // no input, some output
		System.out.println("QA method");
		String s = "Selenium";
		
		return s;
		
		//return type ==> String --returns value of type String
	}
	
	//x,y are input parameters/arguments
	
	public int divison(int x,int y) {               //some input ,some output
		System.out.println("divison method");
		int d=x/y;
		
		return d;
		
		//return type ==> integer --returns value of type integer
	}
	

}
