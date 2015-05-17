package VehicleClassChain;

public class MotorCycle extends Vehicle implements VehicleInterface {
	
	public Boolean hasSideCar;
	
	MotorCycle () {
		
	}
	
	MotorCycle (Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public Boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	@Override
	public
	void transferOwnership(Person newOwner) {
		super.Owner = new Person();
		
	}

}
