public class CaravanSpace extends CampingSpace {
    public CaravanSpace(String local, int[] dimensions, double preco) {
        super(local, dimensions, preco);
    }

    @Override
    int maxRentalDays() {
        return 3 * 365;
    }

    @Override
    SpaceType getType() {
        return SpaceType.CARAVAN;
    }

    @Override
    public boolean canReserve(Client c) {
        return c.getType().equals(ClientType.MEMBER);
    }

    @Override
    public String toString() {
        return "Caravan " + super.toString();
    }
}
