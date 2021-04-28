package javabasics;

public class DataTypes {                   //class body start;

	public static void main(String[] args) //Main method start or execution point-where we ll write our code and the execution starts from once we run the project
	{                                     
/* Primitive data types(integer,double,char and boolean)
 * Non Primitve - Defined by User
 
  1.Integer(-ve,0,+ve)numbers
  How to declare integer
  int i= 10;  i is variable and 10 is the value
  int i = 20; No duplicate variables are allowed;variable should be unique and every statement should be ended with (;)
  But i = 20 can be written which means the existing value 10 is replaced with 20
  
   2.double(Decimal Numbers -- 23.24,425.26,62.33,100.00)
    double d = 25.32;
    double d1 = 100.00;
    double d2 = 52.26;
    
   3.Char --Should be a single digit value and should be wrtten within ('')
    char c = 'a';
    char d = 'b';
    char e = 'aa';  --incorrect
    char f = '1';
    
    4.Boolean(true or false)
    boolean b1 = true;
    boolean b2 = false;
    
    5. String- is a class but not a data type and it should be defined within ("")
    String s = "Hello Good Morning";
    String s1 = "10.23";
    String s2 = "100";
   
   
 */		
		int j = 10;
		System.out.println(j);
		int l = -1;
		System.out.println(l+j);
		
		double d1 = 1000.00;
		System.out.println(d1);
			
		char c = 'a';
		System.out.println(c);
		boolean b = true;
		System.out.println(b);
		String s = "Hello All!!";
		System.out.println(s);
		

	}                                      //Main method end

}                                          // class body end
