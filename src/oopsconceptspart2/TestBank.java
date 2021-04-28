package oopsconceptspart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal); // Calling static value using className/Interface_Name
		//Can't change value of min_bal as it comes from interface hence its constant/final  
		
		HSBCBank h =  new HSBCBank();
		h.credit();
		h.debit();
		h.transfermoney();
		h.eduloan();
		h.carloan();

		//Dynamic Polymorphism
		//Child class class object can be referred by parent Interface reference variable
		// Only Overridden methods can be called/accessed.
		 USBank uobj= new HSBCBank();
		 uobj.credit();
		 uobj.debit();
		 uobj.transfermoney();
	}

}
