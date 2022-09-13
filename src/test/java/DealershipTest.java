import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Customer customer;
    Vehicle vehicle;
    ArrayList<Vehicle> emptyCollection;

    @Before
    public void setUp() {
        vehicle = new Vehicle(CarType.ELECTRIC, 0.5);
        emptyCollection = new ArrayList<Vehicle>();
        customer = new Customer(20000, emptyCollection);
        dealership = new Dealership(emptyCollection, 30000);
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(vehicle);
        emptyCollection.add(vehicle);
        assertEquals(emptyCollection, dealership.getStock());
        assertEquals(25000, dealership.getTill());
    }

    @Test
    public void canSellCar() {
        dealership.buyCar(vehicle);
        dealership.sellCar(vehicle, customer);
        assertEquals(emptyCollection, dealership.getStock());
        emptyCollection.add(vehicle);
        assertEquals(emptyCollection, customer.getCollection());
        assertEquals(30000, dealership.getTill());
        assertEquals(15000, customer.getMoney());
    }

    @Test
    public void cantSellIfNotInStock() {
        dealership.sellCar(vehicle, customer);
        assertEquals(30000, dealership.getTill());
    }

    @Test
    public void canRepairCar(){
        dealership.buyCar(vehicle);
        dealership.repairCar(vehicle);
        assertEquals(20000, dealership.getTill());
        assertEquals(1.0, vehicle.getDamage(), 0.0);
    }
}
