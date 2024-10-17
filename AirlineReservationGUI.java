package ARS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirlineReservationGUI {
    private Airline airline = new Airline();

    public static void main(String[] args) {
        new AirlineReservationGUI().createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Airline Reservation System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 1));

        JButton addFlightButton = new JButton("Add Flight");
        JButton searchFlightButton = new JButton("Search Flight");
        JButton bookFlightButton = new JButton("Book Flight");
        JButton cancelBookingButton = new JButton("Cancel Booking");
        JButton printTicketButton = new JButton("Print Ticket");

        frame.add(addFlightButton);
        frame.add(searchFlightButton);
        frame.add(bookFlightButton);
        frame.add(cancelBookingButton);
        frame.add(printTicketButton);

        addFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFlightDialog();
            }
        });

        searchFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchFlightDialog();
            }
        });

        bookFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookFlightDialog();
            }
        });

        cancelBookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelBookingDialog();
            }
        });

        printTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printTicketDialog();
            }
        });
        frame.setVisible(true);
    }

    private void addFlightDialog() {
        JDialog dialog=new JDialog();
        dialog.setTitle("Add Flight");
        dialog.setSize(300, 300);
        dialog.setLayout(new GridLayout(5, 1));

        JLabel flightNumberLabel = new JLabel("Flight Number:");
        JTextField flightNumberField = new JTextField();
        JLabel departureLabel = new JLabel("Departure:");
        JTextField departureField = new JTextField();
        JLabel destinationLabel = new JLabel("Destination:");
        JTextField destinationField = new JTextField();
        JLabel seatsLabel = new JLabel("Seats:");
        JTextField seatsField = new JTextField();
        JLabel priceLabel = new JLabel("Price:");
        JTextField priceField = new JTextField();

        JButton addButton = new JButton("Add Flight");

        dialog.add(flightNumberLabel);
        dialog.add(flightNumberField);
        dialog.add(departureLabel);
        dialog.add(departureField);
        dialog.add(destinationLabel);
        dialog.add(destinationField);
        dialog.add(seatsLabel);
        dialog.add(seatsField);
        dialog.add(priceLabel);
        dialog.add(priceField);
        dialog.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNumber = flightNumberField.getText();
                String departure = departureField.getText();
                String destination = destinationField.getText();
                int seats = Integer.parseInt(seatsField.getText());
                double price = Double.parseDouble(priceField.getText());

                Flight flight = new Flight(flightNumber, departure, destination, seats, price);
                airline.addflight(flight);
                JOptionPane.showMessageDialog(dialog, "Flight added successfully!");

                dialog.dispose(); 
        }
    });

        dialog.setVisible(true);
    }

    private void searchFlightDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Search Flight");
        dialog.setSize(300, 150);
        dialog.setLayout(new GridLayout(2, 2));

 
        JLabel flightNumberLabel = new JLabel("Flight Number:");
        JTextField flightNumberField = new JTextField();
        JButton searchButton = new JButton("Search");

        dialog.add(flightNumberLabel);
        dialog.add(flightNumberField);
        dialog.add(searchButton);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNumber = flightNumberField.getText();
                Flight flight = airline.findFlight(flightNumber);
                if (flight != null) {
                    JOptionPane.showMessageDialog(dialog, "Flight found: " + flight);
                } else {
                    JOptionPane.showMessageDialog(dialog, "Flight not found.");
                }
                dialog.dispose();
            }
        });

        dialog.setVisible(true);
    }

    private void bookFlightDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Book Flight");
        dialog.setSize(400, 300);
        dialog.setLayout(new GridLayout(6, 2));

        JLabel flightNumberLabel = new JLabel("Flight Number:");
        JTextField flightNumberField = new JTextField();
        JLabel nameLabel = new JLabel("Passenger Name:");
        JTextField nameField = new JTextField();
        JLabel ageLabel = new JLabel("Passenger Age:");
        JTextField ageField = new JTextField();
        JLabel passportLabel = new JLabel("Passport Number:");
        JTextField passportField = new JTextField();

        JButton bookButton = new JButton("Book Flight");

        dialog.add(flightNumberLabel);
        dialog.add(flightNumberField);
        dialog.add(nameLabel);
        dialog.add(nameField);
        dialog.add(ageLabel);
        dialog.add(ageField);
        dialog.add(passportLabel);
        dialog.add(passportField);
        dialog.add(bookButton);

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flightNumber = flightNumberField.getText();
                Flight flight = airline.findFlight(flightNumber);

                if (flight != null && flight.isavailable()) {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    String passportNumber = passportField.getText();

                    Passenger passenger = new Passenger(name, age, passportNumber);
                    Booking booking = new Booking(flight, passenger);
                    booking.createbooking();
                    airline.addBooking(booking);

                    JOptionPane.showMessageDialog(dialog, "Booking successful! Your Booking ID is: " + booking.getbookingID());
                } else {
                    JOptionPane.showMessageDialog(dialog, "Flight not available or fully booked.");
                }
                dialog.dispose();
            }
        });

        dialog.setVisible(true);
    }

    private void cancelBookingDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Cancel Booking");
        dialog.setSize(300, 150);
        dialog.setLayout(new GridLayout(2, 2));

        JLabel bookingIDLabel = new JLabel("Booking ID:");
        JTextField bookingIDField = new JTextField();
        JButton cancelButton = new JButton("Cancel Booking");

        dialog.add(bookingIDLabel);
        dialog.add(bookingIDField);
        dialog.add(cancelButton);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookingID = bookingIDField.getText();
                boolean canceled = airline.cancelbooking(bookingID);

                if (canceled) {
                    JOptionPane.showMessageDialog(dialog, "Booking canceled successfully.");
                } else {
                    JOptionPane.showMessageDialog(dialog, "Booking not found or already canceled.");
                }
                dialog.dispose();
            }
        });

        dialog.setVisible(true);
    }
    private void printTicketDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Print Ticket");
        dialog.setSize(300, 150);
        dialog.setLayout(new GridLayout(3, 2));
    
        JLabel bookingIDLabel = new JLabel("Booking ID:");
        JTextField bookingIDField = new JTextField();
    
        JButton printButton = new JButton("Print Ticket");
        JTextArea ticketArea = new JTextArea(); 
    
        dialog.add(bookingIDLabel);
        dialog.add(bookingIDField);
        dialog.add(printButton);
        dialog.add(new JScrollPane(ticketArea)); 
    
        printButton.addActionListener(e -> {
            String bookingID = bookingIDField.getText();
            Booking booking = airline.findbookings(bookingID);  
    
            if (booking != null) {
                ticketArea.setText(booking.printticket());
            } else {
                ticketArea.setText("Booking ID not found!");
            }
        });
        dialog.setVisible(true);
    }
}    
