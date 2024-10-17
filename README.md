# AirlineReservationSystem
Airline Reservation System (Java GUI)
Overview
The Airline Reservation System is a Java-based desktop application that enables users to manage airline flights, book tickets, cancel bookings, and print tickets via a graphical user interface (GUI). The system leverages Swing components for the GUI and provides functionalities such as adding flights, booking passengers, and managing reservations.

Features
Add Flights: Add flight details like flight number, departure, destination, seats, and price.
Search Flights: Look up flights using the flight number.
Book Flights: Book seats for passengers by entering passenger information.
Cancel Booking: Cancel a specific booking using the booking ID.
Print Ticket: Print and display the ticket for a specific booking ID.
Technologies Used
Java
Swing for GUI components
Directory Structure
bash
Copy code
/ARS
├── AirlineReservationGUI.java   # Main class with GUI
├── Airline.java                 # Airline class with flight and booking management
├── Flight.java                  # Flight class with flight details
├── Passenger.java               # Passenger class with passenger details
├── Booking.java                 # Booking class with booking details and methods
└── README.md                    # This file
Installation and Setup
Prerequisites:

Java Development Kit (JDK) installed (version 8+).
Any IDE like Eclipse, IntelliJ IDEA, or NetBeans (optional).
Clone the Repository:

bash
Copy code
git clone <repository-url>
cd ARS
Compile the Code: Open a terminal or command prompt in the project folder and run:

bash
Copy code
javac ARS/*.java
Run the Application:

bash
Copy code
java ARS.AirlineReservationGUI
How to Use
Add Flight:

Click the "Add Flight" button in the GUI.
Enter flight number, departure, destination, available seats, and price.
Click Add Flight to save the flight.
Search Flight:

Click "Search Flight" in the GUI.
Enter the flight number and click Search.
Book Flight:

Click "Book Flight" in the GUI.
Enter flight number, passenger name, age, and passport number.
Click Book Flight to confirm the booking. A booking ID will be generated.
Cancel Booking:

Click "Cancel Booking" in the GUI.
Enter the booking ID and click Cancel to remove the booking.
Print Ticket:

Click "Print Ticket" in the GUI.
Enter the booking ID and click Print Ticket to display the ticket details.
Known Issues
Error Handling: Some user inputs may not be validated (e.g., incorrect age input). Future improvements could include more robust error handling.
UI Scaling: The layout may not scale perfectly on all screen sizes.
Future Improvements
Implement database storage for persistent data.
Add real-time flight availability updates.
Improve input validation and exception handling.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Author
Your Name
Feel free to reach out with questions or feedback!
