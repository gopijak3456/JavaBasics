package javabasics;

public class IfElse {

	public static void main(String[] args) {
		// Comparison Operators(<,>,<=,>=,==,!=)
		
		int a = 10;
		int c = 20;
		if(c>a) {
			System.out.println("c is greater than a");
		}
		else {
			System.out.println("a is greater than c");
		}
//End 
		
		int d = 40;
		int e = 40;
		if(d==e) {
			System.out.println("d is equal to e");
		}
		else {
				System.out.println("d and e are not equal");
			}
//End
		
		// Program to find the highest number
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//Nested if-else
		// Check logic tables once for better understanding
		
		if((a1>b1)&(a1>c1)) {     // true and true == true
			System.out.println("a1 is the greates");
		}
		else if ((b1>a1) & (b1>c1)) {
			System.out.println("b1 is greatest");
		}
		else {
		    System.out.println("c1 is the greatest");
		}
		
	}

}

