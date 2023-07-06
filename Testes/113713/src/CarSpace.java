public class CarSpace extends CampingSpace {
    public CarSpace(String local, int[] dimensions, double preco) {
        super(local, dimensions, preco);
    }

    @Override
    int maxRentalDays() {
        return 3 * 30;
    }

    @Override
    SpaceType getType() {
        return SpaceType.CAR;
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
