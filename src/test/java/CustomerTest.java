import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Vehicle vehicle;
    ArrayList<Vehicle> emptyCollection;

    @Before
    public void setUp() {
        vehicle = new Vehicle(CarType.ELECTRIC, 0.5);
        emptyCollection = new ArrayList<Vehicle>();
        customer = new Customer(20000, emptyCollection);
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(vehicle);
        emptyCollection.add(vehicle);
        assertEquals(emptyCollection, customer.getCollection());
        assertEquals(15000, customer.getMoney());
    }

    @Test
    public void cantBuyIfNoMoney() {
        Customer skintCustomer = new Customer(2500, emptyCollection);
        skintCustomer.buyCar(vehicle);
        assertEquals(emptyCollection, skintCustomer.getCollection());
    }


}
