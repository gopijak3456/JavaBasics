package oopsconceptspart2;

public interface USBank {  //Parent 1  --Interface contains list of Rules that must be followed

	int min_bal = 100;
	
	public void credit(); //In interface only declaration is enough...Entire body is not required
	
	public void debit();
	
	public void transfermoney();
	
	//Only method declaration
	//No method body
	//We just declare method prototype
	//In Interface we can declare the variable and variables are by default static in nature
	//Value of variables cannot be changed ,its final/constant in nature
	//No Static method methods are used in Interface 
	//Why?Interface is OOP concept and its part of objects..Objects can not have static methods.
	//No main Method in interface
	//We cannot create the object of interface
	//Interfaces are abstract in nature
	
}
