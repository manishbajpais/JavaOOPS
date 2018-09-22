package oops.java;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(2, 3);
		obj.sum(10.0);
		

	}
	
	public static void main(int b) {
		
	}

	
	public static void main(int b, int q) {
		
	}
	
	// we can overload main method also with different arguements	
	// you can not create a emthod inside a method
	// duplicate methods -- i.e.-- same method name with same number of arguments are not allowed
	
	//method overloading -- when the method name is same with different arguments or input parameters with in a class 
	public void sum() { // 0 input parameter
		System.out.println("Sum Method -- Zero Parameters");
		
	}
	
	public void sum(int i) { // 1 input parameter
		System.out.println("Sum Method 1 input parameter");
	}
	
	public void sum(int i, int j) { // 2 input parameter
		System.out.println("Sum Method 2 input parameter");
	}
	
	public void sum(double d) {
		System.out.println("Sum Method -- 1 Parameters with different data type");
	}
	
	

}
