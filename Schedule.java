import java.util.ArrayList;

public class Schedule
{
    private String start_time;
    private String end_time;
    private ArrayList<Route> tripRoute; // each schedule has a route
    private ArrayList<Vehicle> vehicles; // each schedule has a vehicle
    private ArrayList<Trip> trips; // each schedule has a trip

    public Schedule(String start_time, String end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void addRoute(Route trail)
    {
        tripRoute = new ArrayList<>();
        tripRoute.add(trail);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", tripRoute=" + tripRoute.get(0).getStart_point() +
                " to " + tripRoute.get(0).getEnd_point() +
                ", vehicles=" + vehicles +
                ", trips=" + trips +
                '}';
    }
}
