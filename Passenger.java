package ARS;

public class Passenger {
    private String name;
    private int age;
    private String passportno;

    public Passenger(String name,int age,String passportno){
        this.age=age;
        this.name=name;
        this.passportno=passportno;
    }
    public String getname(){
        return name;
    }
    @Override
    public String toString(){
        return "Name: "+name+"Age: "+age+"Passport No: "+passportno;
    }
}
