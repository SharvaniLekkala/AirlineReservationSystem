package ARS;
import java.util.ArrayList;

public class Airline {
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public void addflight(Flight flight) {
        flights.add(flight);
    }
    public Flight findFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getflightno().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public Booking findbookings(String bookingid) {
        for (Booking booking : bookings) {
            if (booking.getbookingID().equals(bookingid)) {
                return booking;
            }
        }
        return null;
    }
    public boolean cancelbooking(String bookingid) {
        Booking booking = findbookings(bookingid);
        if (booking != null && booking.getStatus()) { 
            booking.cancelbooking();  
            return true;  
        }
        return false;  
    }  
}
