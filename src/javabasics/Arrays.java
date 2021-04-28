package javabasics;

public class Arrays {

	public static void main(String[] args) {
	// Array--> is used to store similar data type values in a array variable
	//lowest bound/index = 0
	//highest bound/index = n-1 where (n is size of array)
	// One dimensional Arrays
		//Disadvantages of Array
			//1.size is fixed -->it is called as static Array ==> to overcome this problem we use Collections -- ArrayList,Hashtable --Use dynamic array
			//2.Can store only similar data type values ==> to overcome this problem we use object Array
		
		//int i = 10;  --> integer variable
		int i[] = new int[4];  //--> integer arrary variable
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
	    System.out.println(i[2]);
	    System.out.println(i[3]);
	    
	   // System.out.println(i[4]); //when trying to define the index value greater than its actual size-->gives exception ==> ArrayIndexOutOfBoundException
	    
	    System.out.println(i.length);  //size/length of array
	    //To print all the values of array: ==> Use for loop
	    for(int j=0;j<i.length;j++) {
	    	System.out.println(i[j]);
	    }
	    
	    //2.Double array
	    double d[] = new double[3];
	    d[0] = 25.22;
	    d[1] = 28.22;
	    d[2] = 87.22;
	    System.out.println(d[2]);
	    
	    
	    //3.Char Array
	    char c[] = new char[4];
	    c[0] = 'a';
	    c[1] = 'b';
	    c[2] = 'c';
	    c[3] = 'd';
	    System.out.println(c[0]);
	    System.out.println(c.length);
	    
	    //4 Boolean Array
	    boolean b[] = new boolean[3];
	    b[0] = true;
	    b[1] = false;
	    b[2] = true;
	    System.out.println(b[2]);
	    System.out.println(b[0]);
	    
	    //5.String Array
	    String s[] = new String[4];
	    s[0] = "Hi";
	    s[1] = "I am";
	    s[2] = "Gopi";
	    s[3] = "how are you?";
	    System.out.println(s[0]+' '+ s[1]+' '+s[2]+' ' + s[3]);
	    
	    //6.Object Array:  object==> is a super class of all the classes available in Java
	    	// It is used to store different data type values
	    Object ob[] = new Object[6];
	    ob[0] = "Tom";
	    ob[1] = 25;
	    ob[2] = 12.33;
	    ob[3] = "08/08/1996";
	    ob[4] = 'M';
	    ob[5] = "London";
	    System.out.println(ob[5]);
	    System.out.println(ob.length);
	    
	    for(int k=0;k<ob.length;k++) {
	    	System.out.println(ob[k]);
	    }
	    	
	}
	

}
