public abstract class CampingSpace {
    private String local;
    private int[] dimensions;
    private double price;

    public CampingSpace(String local, int[] dimensions, double price) {
        this.local = local;
        this.dimensions = dimensions;
        this.price = price;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public String getLocal() {
        return local;
    }

    public double getPrice() {
        return price;
    }

    public int getArea() {
        return dimensions[0] * dimensions[1];
    }

    abstract int maxRentalDays();

    abstract SpaceType getType();

    public boolean canReserve(Client c) {
        return true;
    }

    public double calculateTotalCost(long duration) {
        return this.price * duration;
    }

    @Override
    public String toString() {
        return String.format(
                "space located in %s, with dimensions %dx%d, %.2f/day",
                this.local,
                this.dimensions[0],
                this.dimensions[1],
                this.price
        );
    }
}
