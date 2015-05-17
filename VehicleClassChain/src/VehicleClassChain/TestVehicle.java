package VehicleClassChain;

import java.util.HashMap;
import java.util.UUID;

import com.sun.javafx.collections.MappingChange.Map;
import java.util.*; 

public class TestVehicle {
	
	public HashMap personMap = new HashMap();
	public HashMap truckMap = new HashMap();
	public HashMap mcMap = new HashMap();

	public TestVehicle() {
		
		Person a = new Person();
		Truck truck = new Truck();
		truck.Owner = a;
		truck.setNumberOfAxels(2);
		
		Person b = new Person();
		truck.transferOwnership(b);
		
		MotorCycle MC = new MotorCycle(false);
		
		
		personMap.put(a.getPersonID(), a);
		personMap.put(b.getPersonID(), b);
		
		
		truckMap.put(UUID.randomUUID(), truck);
		
		
		mcMap.put(UUID.randomUUID(), MC);
	

	}

}
