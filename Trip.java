import java.util.ArrayList;

public class Trip
{
    private String from;
    private String destination;

    public Trip(String from, String destination) {
        this.from = from;
        this.destination = destination;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
