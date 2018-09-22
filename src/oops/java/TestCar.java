package oops.java;

public class TestCar {
	public static void main(String[] args) {
		
		// static polymorhism --> compile time polymorphism
		BMW B = new BMW();
		B.start();
		B.stop();
		B.refuel();
		B.safety();
		B.engine();
		System.out.println("****************");
		
		Car C = new Car();
		C.stop();
		C.refuel();
		C.start();
		C.engine();
		System.out.println("****************");
		
		//Top casting
		Car C1 = new BMW(); //child class can be referred by parnet class reference variable --- is called dynamic polymorphism --> runtime polymorphism
		C1.start();
		C1.stop();
		C1.refuel();
		C1.engine();
		
		//Down Casting
		BMW b1 = (BMW) new Car(); //Class cast Exception
		b1.start();
		b1.stop();
		b1.refuel();
	}
}
