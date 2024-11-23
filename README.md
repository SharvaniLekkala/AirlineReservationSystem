# AirlineReservationSystem
**Airline Reservation System (Java GUI)**
**Overview**
The Airline Reservation System is a Java-based desktop application that enables users to manage airline flights, book tickets, cancel bookings, and print tickets via a graphical user interface (GUI). The system leverages Swing components for the GUI and provides functionalities such as adding flights, booking passengers, and managing reservations.<br />

**Features**:<br />
Add Flights: Add flight details like flight number, departure, destination, seats, and price.<br />
Search Flights: Look up flights using the flight number.<br />
Book Flights: Book seats for passengers by entering passenger information.<br />
Cancel Booking: Cancel a specific booking using the booking ID.<br />
Print Ticket: Print and display the ticket for a specific booking ID.<br />
**Technologies Used:**<br />
Java<br />
Swing for GUI components<br />
Directory Structure<br />

**DIRECTORY:**<br />
ARS<br />
AirlineReservationGUI.java   # Main class with GUI<br />
Airline.java                 # Airline class with flight and booking management<br />
Flight.java                  # Flight class with flight details<br />
Passenger.java               # Passenger class with passenger details<br />
Booking.java                 # Booking class with booking details and methods<br />
README.md                    # This file<br />


**Installation and Setup**<br />
**Prerequisites:**<br />

Java Development Kit (JDK) installed (version 8+).<br />
Any IDE like Eclipse or VS code.<br />


**Compile the Code:**<br />
Open a terminal or command prompt in the project folder and run<br />
javac ARS/*.java<br />
**Run the Application:**<br />
java ARS.AirlineReservationGUI<br />

**How to Use**<br />
_Add Flight:_

Click the "Add Flight" button in the GUI.
Enter flight number, departure, destination, available seats, and price.
Click Add Flight to save the flight.
_Search Flight:_

Click "Search Flight" in the GUI.
Enter the flight number and click Search.
_Book Flight:_

Click "Book Flight" in the GUI.
Enter the flight number, passenger name, age, and passport number.
Click Book Flight to confirm the booking. A booking ID will be generated.
_Cancel Booking:_

Click "Cancel Booking" in the GUI.
Enter the booking ID and click Cancel to remove the booking.
_Print Ticket:_

Click "Print Ticket" in the GUI.
Enter the booking ID and click Print Ticket to display the ticket details.

**Known Issues**:<br />
_Error Handling_: Some user inputs may not be validated (e.g., incorrect age input). Future improvements could include more robust error handling.<br />
_UI Scaling:_ The layout may not scale perfectly on all screen sizes.<br />
**Future Improvements**:<br />
Implement database storage for persistent data.<br />
Add real-time flight availability updates.<br />
Improve input validation and exception handling.<br />

