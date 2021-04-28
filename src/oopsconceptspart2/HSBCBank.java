package oopsconceptspart2;

public class HSBCBank implements USBank,BrazilBank{  // we are achieving multiple inheritance (Is-a Relationship)
	//when a class(HSBCBank) implements a interface(USBank) ,its mandatory to define all the methods in interface class in new class along with new methods if any

	public void credit() {                          // overridden from USBANK M1
		System.out.println("HSBC Credit");
	}
	
	public void debit() {							// overridden from USBANK  M2
		System.out.println("HSBC Debit");
	}
	
	public void transfermoney() {					// overridden from USBANK M3
		System.out.println("HSBC TransferMoney");
	}
	
	public void eduloan() {
		System.out.println("HSBC EduLoan");     // Own method of HSBC Bank
	}
	
	public void carloan() {
		System.out.println("HSBC carLoan");   // Own method of HSBC Bank
	}
	
	public void mutualfund() {
		System.out.println("HSBC MutualFund");  //Overridden method from BrazilBank
	}
}

