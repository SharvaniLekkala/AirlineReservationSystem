package ARS;
import java.util.UUID;

public class Booking {
    private String bookingid;
    private Flight flight;
    private Passenger passenger;
    private boolean status;

    // Constructor
    public Booking(Flight flight, Passenger passenger) {
        this.bookingid = UUID.randomUUID().toString().substring(0,3);
        this.flight = flight;
        this.passenger = passenger;
        this.status = true;  
    }
    
    public void createbooking() {
        flight.bookseat(); 
    }

    public void cancelbooking() {
        if (status) {
            flight.cancelseat();  
            status = false;  
        }
    }
    public String getbookingID() {
        return bookingid;
    }

    public boolean getStatus() {
        return status;
    }

    public String printticket() {
        return  "Booking ID: " + bookingid + "\n" +
                "Passenger: " + passenger.getname() + "\n" +
                "Flight: " + flight.getflightno() + "\n" +
                "From: " + flight.getdeparture() + "\n" +
                "To: " + flight.getdestination() + "\n" +
                "Status: " + (status ? "Confirmed" : "Cancelled");
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingid + "\n" + passenger + "\n" + flight;
    }
}
