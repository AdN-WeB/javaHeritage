package javaHéritage;

public class Boat extends Vehicle {
	
	//Constructor for Boat by vehicle class
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);

	}
	
	public String doStuff() {
		return "Je suis " + getBrand() + " et je vogue à travers les eaux";
	}

}
