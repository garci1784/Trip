public class Airplane extends Vehicle
{
    private String type;
    private int ticketNumber;

    public Airplane(String make, String model, int year, String type, int ticketNumber) {
        super(make, model, year);
        this.type = type;
        this.ticketNumber = ticketNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
