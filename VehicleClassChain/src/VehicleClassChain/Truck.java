package VehicleClassChain;

public class Truck extends Vehicle implements VehicleInterface {
	
	public int NumberOfAxels;
	
	Truck () {
		
	}
	
	Truck (int axels) {
		this.NumberOfAxels = axels;
	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

	@Override
	public
	void transferOwnership(Person newOwner) {
		super.Owner = newOwner;
		
	}
	
	

}
