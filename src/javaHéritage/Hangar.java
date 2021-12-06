package javaHéritage;

public class Hangar {

	public static void main(String[] args) {
		Vehicle abarth = new Car("Abarth", 100000);
		Vehicle polo = new Car ("Polo", 150000);
		Vehicle zodiak = new Boat("Zodiak", 45000);
		Vehicle odyssey= new Boat("Odyssey", 3000);
		
		System.out.println(abarth.doStuff());
		System.out.println(polo.doStuff());
		System.out.println(zodiak.doStuff());
		System.out.println(odyssey.doStuff());
		
	}
	
	

}
