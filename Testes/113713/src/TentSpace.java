public class TentSpace extends CampingSpace {
    public TentSpace(String local, int[] dimensions, double preco) {
        super(local, dimensions, preco);
    }

    @Override
    int maxRentalDays() {
        return 10;
    }

    @Override
    SpaceType getType() {
        return SpaceType.TENT;
    }

    @Override
    public String toString() {
        return "Tent " + super.toString();
    }
}
