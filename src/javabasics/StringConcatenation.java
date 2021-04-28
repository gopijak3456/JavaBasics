package javabasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// In Java String is a class and not a datatype
		// + ==> String concatenation operator
		// println ==> is used to print on the console with a new line
		// print ==> is used to just print something on the console
		int a = 100;
		int b = 200;
		String x = "hello";
		String y = "world";
		double c = 10.33;
		double d = 9.58;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println((a+b)+x+y);
		System.out.println(c+d);
		System.out.println(a+b+x+y+c+x+y+a+d);
		System.out.println("Hello world!!");
	    System.out.println("The value of a is: "+ a);
	    System.out.println("The sum of a,b,c,d is: "+ (a+b+c+d));
	    System.out.print("Hello Selenium");
	    System.out.println("Hello Testing");  

	}

}
