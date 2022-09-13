import java.util.ArrayList;

public class Customer implements IBuy {
    private int money;
    private ArrayList<Vehicle> collection;

    public Customer(int money, ArrayList<Vehicle> collection) {
        this.money = money;
        this.collection = new ArrayList<Vehicle>();
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getCollection() {
        return collection;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCollection(ArrayList<Vehicle> collection) {
        this.collection = collection;
    }

    public void buyCar (Vehicle vehicle) {
        if (this.money >= vehicle.getFinalCost()) {
            this.money -= vehicle.getFinalCost();
            this.collection.add(vehicle);
        }
    }
}
