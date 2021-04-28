package javabasics;

public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest();

	/* Singleton design pattern -- Used incase multiple different object references need to be pointed to same object
	 * Singleton class should have the constructor as private
	 */
	
	private SingleTonTest() {
		System.out.println("Creating Object");
	}
	
	public static SingleTonTest getInstance() {
		return instance;
		
	}
	
}

