import java.util.Scanner;
public class FlightReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Flight Number: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter Departure Date (dd/MM/yyyy): ");
        String departureDate = scanner.nextLine();
        // إنشاء كائن من Flight
        Flight flight = new Flight(flightNumber, destination, departureDate);

        // عرض بيانات الرحلة
        flight.displayFlightInfo();


        while (true) {
            System.out.println("\n===== Flight Reservation Menu =====");
            System.out.println("1. Reserve a Seat");
            System.out.println("2. View Seat Map");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Row (0 - 4): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter Column (0 - 3): ");
                    int col = scanner.nextInt();
                    flight.reserveSeat(row, col);
                    break;

                case 2:
                    flight.printSeatMap();
                    break;

                case 3:
                    System.out.println("✅ Thank you for using Flight Reservation System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}