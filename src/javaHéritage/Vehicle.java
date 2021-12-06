package javaHéritage;

public abstract class Vehicle {
	
	//Initialized attributes
	private String brand;
	private int kilometers;
	//Constructor for vehicle 
	public Vehicle (String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	//Getter for brand attribute
	public String getBrand() {
		return brand;
	}
	//Setter for brand attribute
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	//Getter for kilometers attribute
	public int getKilometers() {
		return kilometers;
	}
	
	//Setter for kilometers attribute
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public String doStuff() {
		return null;
	}
}
