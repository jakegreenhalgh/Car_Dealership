import java.util.ArrayList;

public class Dealership implements IBuy {
    private ArrayList<Vehicle> stock;
    private int till;

    public Dealership(ArrayList<Vehicle> stock, int till) {
        this.stock = new ArrayList<Vehicle>();
        this.till = till;
    }

    public void buyCar (Vehicle vehicle) {
        if (this.till >= vehicle.getFinalCost()) {
            this.till -= vehicle.getFinalCost();
            this.stock.add(vehicle);
        }
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public int getTill() {
        return till;
    }

    public void sellCar(Vehicle vehicle, Customer customer) {
        if (this.stock.contains(vehicle) && customer.getMoney() >= vehicle.getFinalCost()) {
            this.stock.remove(vehicle);
            this.till += vehicle.getFinalCost();
            customer.buyCar(vehicle);
        }
    }

    public void repairCar(Vehicle vehicle) {
        double repairCost = vehicle.getFinalCost() * (1 - vehicle.getDamage());
        if (this.stock.contains(vehicle) && this.till >= repairCost) {
            this.till -= repairCost;
            vehicle.setDamage(1.0);
        }
    }
}
