package oopsconceptspart1;

public class WrapperClass {

	public static void main(String[] args) {

		// Data Conversion --String to Int using ParseInt()
		String x ="100";
		System.out.println(x+20);
		
		int i= Integer.parseInt(x);
		System.out.println(i+20);

		// Wrapper classes -- Integer,Double,Boolean
		
		// Data Conversion --String to Double using ParseDouble()
		String y = "12.33";
		System.out.println(y+20);
		
		Double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		// Data Conversion --String to Boolean using ParseBoolean()
		String k ="true";
		System.out.println(k);
		
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// int to String conversion
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String u ="100A";
		Integer.parseInt(u);  //NumberFormatException -- For input string: "100A"
	}

}
