package javabasics;

public class ComparisonTest {
	/*
	 * == --> Comparison operator -- compare object references  addresses
	 * .equals() ==>validate whether the content is same or not
	 */

	public static void main(String[] args) {
		
		String name1 = "Way2Automation";
		String name2 = "Way2Automation";
		
		int x=100;
		int y=100;
		
		String name_1 = new String("Raman");
		String name_2 = new String("raman");
		
		/*
		 * System.out.println(name1==name2);
		 * System.out.println(name1.equals(name2));
		 * 
		 * System.out.println(x==y);
		 */
		
		/*
		 * System.out.println(name_1.equals(name_2)); //content validation
		 * System.out.println(name_1==name_2); //object reference validation
		 */		
		
		// Singleton design pattern -- Used incase multiple different object references need to be pointed to same object
		
		
		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
 
	}

}
