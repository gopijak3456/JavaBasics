package javabasics;

public class Loops {

	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i = i+1;  // Disadvantage ==> if increement/decremental is not declared --while loops gets into infinite loop
		}
		// j++ ==> j=j+1
		
		// For loop
		for(int j=1;j<=10;j++) {   //(initialization;conditional;icreemental)
			System.out.println("");
		}
		
		for(int k=10;k>=-10;k--) {  //(initialization;conditional;decreemental)
			System.out.println(k);
		}

	}

}
