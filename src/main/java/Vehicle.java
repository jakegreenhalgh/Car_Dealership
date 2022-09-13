public class Vehicle {
    private CarType carType;
    private double damage;

    public Vehicle(CarType carType, double damage) {
        this.carType = carType;
        this.damage = damage;
    }

    public double getFinalCost() {
        return this.carType.getPrice() * damage;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
