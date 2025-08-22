import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Flight {
    private String flightNumber;
    private String destination;
    private LocalDate departureDate;
    private boolean[][] seats; // true = booked, false = available

    public Flight(String flightNumber, String destination, String departureDate) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.departureDate = LocalDate.parse(departureDate, formatter);
        this.seats = new boolean[5][4]; // 5 rows × 4 columns
    }

    public boolean reserveSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("❌ Invalid seat number.");
            return false;
        }

        if (seats[row][col]) {
            System.out.println("❌ Seat already booked!");
            return false;
        } else {
            seats[row][col] = true;
            System.out.println("✅ Seat booked successfully!");
            return true;
        }
    }

    public void printSeatMap() {
        System.out.println("\n--- Seat Map for Flight " + flightNumber + " ---");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] ? "[X] " : "[O] ");
            }
            System.out.println();
        }
    }

    // Display flight info
    public void displayFlightInfo() {
        System.out.println("\n=== Flight Information ===");
        System.out.println("Flight: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Date: " + departureDate);
    }
}






