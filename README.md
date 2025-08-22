# FlightReservationSystem

A simple Java console-based Flight Reservation System.  
It allows users to view a seat map (5x4 grid), reserve seats with validation, and prevents double-booking.  
This project demonstrates key Java concepts: 2D arrays, nested loops, encapsulation, LocalDate/DateTimeFormatter, command-line arguments, and menu-driven interaction.

---

## ✈️ Features
- Manage a single flight (number, destination, departure date).
- Seat map represented as a 5×4 grid (`boolean[5][4]`).
- Menu options:
  1. Show seat map
  2. Reserve a seat
  3. Exit
- Prevents invalid seat numbers and double booking.
- Supports both command-line arguments and default hardcoded data.

Legend:  
- [O] → Available seat  
- [X] → Booked seat  

---

## 🧰 Tech Stack
- Language: Java (JDK 8+, recommended JDK 17+)
- No external libraries required (uses only java.util and `java.time`)

---

## 🚀 Getting Started

### 1. Prerequisites
- Install Java JDK 8+ (JDK 17 recommended).

### 2. Compile
```bash
javac FlightReservationSystem.java

---

## Run

🔹 Run with Default Flight Data

java FlightReservationSystem
🔹 Run with Command-Line Arguments

java FlightReservationSystem <flightNumber> <destination> <dd/MM/yyyy>
Example:

java FlightReservationSystem MS456 London 30/09/2025

---

## 🕹️ Sample Usage
=== Flight Information ===
Flight: MS123
Destination: Cairo
Departure Date: 2025-08-25

=== Menu ===
1. Show seat map
2. Reserve a seat
3. Exit
Choose an option: 1

--- Seat Map for Flight MS123 ---
[O] [O] [O] [O]
[O] [O] [O] [O]
[O] [O] [O] [O]
[O] [O] [O] [O]
[O] [O] [O] [O]

---

## 🧠 Design Notes
- Encapsulation → Flight details and seat map are private.
- Validation → Prevents invalid indexes and duplicate booking.
- Modularity → Flight handles logic, FlightReservationSystem handles UI/menu.
- Date Handling → Uses LocalDate and DateTimeFormatter.

---

## 🔮 Future Enhancements
- Cancel seat reservations.
- Auto-assign the first available seat.
- Human-friendly seat labels (1–5, A–D).
- Manage multiple flights.
- Save/load reservations from a file or database.
- Add unit tests with JUnit.

---

## 👩‍💻 Author
Mariam Samy
Aspiring Software Tester & Developer | Python & Java Enthusiast

