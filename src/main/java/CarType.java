public enum CarType {
    ELECTRIC("Green", 10000, new Engine("Electric"), new Tyre("Road")),
    PETROL("Red", 5000, new Engine("Petrol"), new Tyre("Off-Road")),
    HYBRID("Blue", 7500, new Engine("Hybrid"), new Tyre("Road"));

    private final String colour;
    private final int price;
    private final Engine engine;
    private final Tyre tyre;

    CarType(String colour, int price, Engine engine, Tyre tyre) {
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
