import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CampingService implements CampingServiceInterface {
    private String name;
    private String address;


    private List<CampingSpace> spaces = new ArrayList<>();
    private Map<Integer, Client> clients = new HashMap<>();


    private List<Booking> bookings = new ArrayList<>();
    private Map<Client, List<Booking>> clientBookings = new HashMap<>();


    public CampingService(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean registerClient(int numContribuinte, String name, ClientType clientType) {
        if (this.clients.containsKey(numContribuinte))
            return false;

        this.clients.put(numContribuinte, new Client(numContribuinte, name, clientType));

        return true;
    }

    @Override
    public void addCampingSpace(CampingSpace space) {
        this.spaces.add(space);
    }

    @Override
    public void addCampingSpaces(Collection<CampingSpace> campingSpaces) {
        this.spaces.addAll(campingSpaces);
    }

    @Override
    public boolean checkAvailability(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate) {
        for (Booking booking : this.bookings) {
            if (booking.getSpace() != campingSpace)
                continue;

            if (booking.getStartDate().isBefore(endDate) && booking.getEndDate().isAfter(startDate))
                return false;
        }

        return true;
    }

    @Override
    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration, int[] minDimensions) {
        final List<CampingSpace> options = new ArrayList<>();
        final LocalDate endDate = fromDate.plusDays(duration);

        search:
        for (CampingSpace space : this.spaces) {
            if (!space.getType().equals(spaceType))
                continue;

            int[] dimensions = space.getDimensions();

            for (int i = 0; i < minDimensions.length; i++) {
                if (dimensions[i] < minDimensions[i]) continue search;
            }

            if (!this.checkAvailability(space, fromDate, endDate))
                continue;

            options.add(space);
        }

        return options;
    }

    @Override
    public Client getClient(int numContribuinte) {
        return this.clients.get(numContribuinte);
    }

    @Override
    public boolean bookCampingSpace(Client client, CampingSpace space, LocalDate startDate, int duration) {
        if (!space.canReserve(client))
            return false;

        if (space.maxRentalDays() < duration)
            return false;

        final LocalDate endDate = startDate.plusDays(duration);

        if (!this.checkAvailability(space, startDate, endDate))
            return false;

        final Booking booking = new Booking(client, space, startDate, endDate);

        this.bookings.add(booking);
        List<Booking> cBookings = this.clientBookings.computeIfAbsent(client, c -> new ArrayList<>());
        cBookings.add(booking);

        return true;
    }

    @Override
    public double calculateTotalCost(CampingSpace campingSpace, int duration) {
        return campingSpace.calculateTotalCost(duration);
    }

    @Override
    public List<String> listBookings() {
        return this.bookings.stream().map(Booking::toString).collect(Collectors.toList());
    }

    @Override
    public List<String> listBookings(SpaceType spaceType) {
        return this.bookings.stream().filter(booking -> booking.getSpace().getType().equals(spaceType)).map(Booking::toString).collect(Collectors.toList());
    }

    public Stream<CampingSpace> getAvailableSpacesByTotalArea(LocalDate startDate, int duration) {
        final LocalDate endDate = startDate.plusDays(duration);
        return this.spaces.stream()
                .filter(space -> this.checkAvailability(space, startDate, endDate))
                .sorted(Comparator.comparing(CampingSpace::getArea).reversed());
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name, this.address);
    }
}
