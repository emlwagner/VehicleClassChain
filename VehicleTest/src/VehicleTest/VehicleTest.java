package VehicleTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import VehicleClassChain.Person;
import VehicleClassChain.TestVehicle;
import VehicleClassChain.Truck;

public class VehicleTest {
	
	TestVehicle v = new TestVehicle();
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersonHash() {
		int numPeople = 2;
		assertEquals(numPeople, v.personMap.size());
	}
	
	@Test
	public void testTruckHash() {
		int numTruck = 1;
		assertEquals(numTruck, v.truckMap.size());
	}
	
	@Test
	public void testMCHash() {
		int numMC = 1;
		assertEquals(numMC, v.mcMap.size());
	}
	

		
	

}
