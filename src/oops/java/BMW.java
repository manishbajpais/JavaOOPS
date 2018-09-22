package oops.java;

public class BMW extends Car { //**** has a relationship ******
	
	//when same method is present in parent class as well as child class with same name and same number of arguments, is called method Overriding
	public void start() { //overridden method
		System.out.println("BMW... automatic Start");
	}
	
	public void safety() {
		System.out.println("BMW... Theft Safety methods");
	}

}
