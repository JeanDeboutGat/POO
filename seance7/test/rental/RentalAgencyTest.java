package rental;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import rental.*;

public class RentalAgencyTest {
	private Client client1;
	private Client client2;
	private RentalAgency rentalAgency;
	private Vehicle vehicle;

	@Before
	public void before(){
		this.rentalAgency = new RentalAgency();
		this.vehicle = new Vehicle("Vroum", "Vroum", 2000, 100);
		this.client1 = new Client("Tim Oleon", 25);
		this.client2 = new Client("Tim Oleon", 25);
	}

	@Test
	public void twoClientObjectsWithSameNameCorrespondsToSameClient()
					throws IllegalStateException, UnknownVehicleException {

		this.rentalAgency.addVehicle(this.vehicle);

		assertEquals(100, this.rentalAgency.rentVehicle(this.client1, this.vehicle),0.0001) ;
		//assertTrue(this.rentalAgency.hasRentedAVehicle(this.client1));
		// client2 corresponds to same client than client1 since names are equals

		// then test should succeed
		assertFalse(this.rentalAgency.hasRentedAVehicle(this.client2));
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}

}
