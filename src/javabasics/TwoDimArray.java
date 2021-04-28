package javabasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String s[][] = new String[3][5];
		System.out.println(s.length);  //--> To get total number of rows in 2-D Array
		System.out.println(s[0].length); // To get total number of columns in 2-D Array
		// first row
		s[0][0] = "A";
		s[0][1] = "B";
		s[0][2] = "C";
		s[0][3] = "D";
		s[0][4] = "E";
		// second row
		s[1][0] = "A1";
		s[1][1] = "B2";
		s[1][2] = "C2";
		s[1][3] = "D2";
		s[1][4] = "E2";
		// third row
		s[2][0] = "A3";
		s[2][1] = "B3";
		s[2][2] = "C3";
		s[2][3] = "D3";
		s[2][4] = "E3";
		
		System.out.println(s[1][2]);
		System.out.println(s[2][2]);
		System.out.println(s[0][4]);
		// to print all the values of 2-D Array ==> Use for loop
		for(int row=0;row<s.length;row++) {
			for(int col=0;col<s[0].length;col++) {
				System.out.println(s[row][col]);
			}
		}
		

	}

}
