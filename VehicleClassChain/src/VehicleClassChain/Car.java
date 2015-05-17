package VehicleClassChain;

public class Car extends Vehicle implements VehicleInterface{
	
	public int NumberOfDoors;
	
	Car() {
		
	}
	
	Car (int doors) {
		this.NumberOfDoors = doors;
	}

	@Override
	public
	void transferOwnership(Person newOwner) {
		super.Owner = new Person();
		
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

}
