package javaHéritage;

public class Car extends Vehicle {
	
	//Constructor for car by vehicle class
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	public String doStuff() {
		return "Je suis " + getBrand() + " et je roule comme un papy";
	}

}
