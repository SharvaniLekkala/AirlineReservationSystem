package ARS;

public class Flight {
    private String flightno;
    private String departure;
    private String destination;
    private int availableseats;
    private double price;

    public Flight(String flightnno,String departure,String destination,int availableseats,double price){
        this.availableseats=availableseats;
        this.departure=departure;
        this.destination=destination;
        this.flightno=flightnno;
        this.price=price;
    }
    public boolean isavailable(){
        return availableseats>0;
    }
    public void bookseat(){
        if(availableseats>0){
            availableseats--;
        }
    }
    public void cancelseat(){
        availableseats++;
    }
    public String getflightno(){
        return flightno;
    }
    public String getdestination(){
        return destination;
    }
    public String getdeparture(){
        return departure;
    }
    @Override
    public String toString() {
        return "Flight " + flightno + " from " + departure + " to " + destination +
               ", Seats Available: " + availableseats + ", Price: $" + price;
    }
}
