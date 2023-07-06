import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private Client client;
    private CampingSpace space;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(Client client, CampingSpace space, LocalDate startDate, LocalDate endDate) {
        this.client = client;
        this.space = space;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public CampingSpace getSpace() {
        return space;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        final long duration = ChronoUnit.DAYS.between(startDate, endDate);
        return String.format("%s - [%s : %s] %s, total cost: %.2f\n", this.client, this.startDate, this.endDate, this.space, this.space.calculateTotalCost(duration));
    }
}
