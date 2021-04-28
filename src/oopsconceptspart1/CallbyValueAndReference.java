package oopsconceptspart1;

public class CallbyValueAndReference {

	int p;
	int q;
	
	public static void main(String[] args) {

		//Is Call by reference Possible in Java? Yes
		//in C we used to do it by using POinters
		
		CallbyValueAndReference obj = new CallbyValueAndReference();
		int x=10;
		int y=30;
		obj.Test(x, y); //call by value oR pass by value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//After Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int Test(int a,int b) {
		a = 30;
		b= 40;
		int c = a+b;
		return c;
	}
	//Call by reference is possible in java using object reference(ref to reference)
	public void swap(CallbyValueAndReference t) {
		int temp;
		temp = t.p; // temp =50
		t.p = t.q;  //t.p =60
		t.q =temp; //t.q =50
		
	}
	
	
}
