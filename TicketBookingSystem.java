import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

record TicketData(String passengerName, String source, String destination, double price) {}

// Step 2: Sealed abstract class for Ticket
sealed abstract class Ticket permits BusTicket, TrainTicket, FlightTicket {
    protected final String bookingId;
    protected final TicketData data;

    public Ticket(TicketData data) {
        this.data = data;
        this.bookingId = generateBookingId();
    }

    private String generateBookingId() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public String getBookingId() {
        return bookingId;
    }

    public abstract void bookTicket();

    @Override
    public String toString() {
        return String.format("[%s] %s from %s to %s - $%.2f",
                bookingId, data.passengerName(), data.source(), data.destination(), data.price());
    }
}

// Step 3: Concrete ticket types
final class BusTicket extends Ticket {
    public BusTicket(TicketData data) { super(data); }

    @Override
    public void bookTicket() {
        System.out.println("Bus Ticket booked: " + this);
    }
}

final class TrainTicket extends Ticket {
    public TrainTicket(TicketData data) { super(data); }

    @Override
    public void bookTicket() {
        System.out.println("Train Ticket booked: " + this);
    }
}

final class FlightTicket extends Ticket {
    public FlightTicket(TicketData data) { super(data); }

    @Override
    public void bookTicket() {
        System.out.println("Flight Ticket booked: " + this);
    }
}

// Step 4: Factory class
class TicketFactory {
    public static Ticket createTicket(String type, TicketData data) {
        return switch (type.toLowerCase()) {
            case "bus" -> new BusTicket(data);
            case "train" -> new TrainTicket(data);
            case "flight" -> new FlightTicket(data);
            default -> throw new IllegalArgumentException("Invalid ticket type: " + type);
        };
    }
}

// Step 5: Ticket Booking System
public class TicketBookingSystem {
    private final List<Ticket> bookedTickets = new ArrayList<>();

    public Ticket bookTicket(String type, TicketData data) {
        Ticket ticket = TicketFactory.createTicket(type, data);
        ticket.bookTicket();
        bookedTickets.add(ticket);
        return ticket;
    }

    public void showAllBookings() {
        System.out.println("\n--- All Booked Tickets ---");
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            bookedTickets.forEach(System.out::println);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        system.bookTicket("bus", new TicketData("Alice", "CityA", "CityB", 25.0));
        system.bookTicket("train", new TicketData("Bob", "TownX", "TownY", 100.0));
        system.bookTicket("flight", new TicketData("Charlie", "Metro1", "Metro2", 300.0));

        system.showAllBookings();
    }
}