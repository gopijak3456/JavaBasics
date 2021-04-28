package javabasics;

public class IncAndDecOper {

	public static void main(String[] args) {
		//++
		//--
		int i=1;
		int j=i++; //Post increement  ==> j=i and i increase
		
		System.out.println(i);
		System.out.println(j);
		
		int a = 3;
		int b = ++a; //pre increement ==> a and b increase by +1
		System.out.println(a);
		System.out.println(b);
		
		int m = 2;
		int n = m--; //post decreement ==> n=2 and m decrease by 1
		System.out.println(m);
		System.out.println(n);

		int p = 2;
		int q = --p; //pre decreement ==> a and b decrease by -1
		System.out.println(p);
		System.out.println(q);
	}

}
