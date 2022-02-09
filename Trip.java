import java.util.ArrayList;

public class Trip
{
    private String from;
    private String destination;
    private ArrayList<Schedule> schedules; // many schedules for one trip

    public Trip(String from, String destination, ArrayList<Schedule> schedules) {
        this.from = from;
        this.destination = destination;
        this.schedules = schedules;
    }
}
