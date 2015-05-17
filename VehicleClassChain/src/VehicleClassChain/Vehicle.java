package VehicleClassChain;

public abstract class Vehicle {
	
	public String Name;
	public String Color;
	public String Weight;
	public Person Owner;
	
	abstract void transferOwnership (Person newOwner);

}
