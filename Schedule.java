import java.util.ArrayList;

public class Schedule
{
    private String start_time;
    private String end_time;
    private ArrayList<Route> routes; // each schedule has a route
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

    public void addRoute(Route route)
    {
        routes = new ArrayList<>();
        routes.add(route);
    }

    public void addVehicle(Vehicle vehicle)
    {
        vehicles = new ArrayList<>();
        vehicles.add(vehicle);
    }

    public void addTrips(Trip trip)
    {
        trips = new ArrayList<>();
        trips.add(trip);
    }

    public void displayRoutes()
    {
        for (Route route:  routes) {
            System.out.println("Route Start Point: " + route.getStart_point());
            System.out.println("Route End Point: " + route.getEnd_point());
        }
    }

    public void displayTrips()
    {
        for (Trip trip:  trips) {
            System.out.println("Trip starts from: " + trip.getFrom());
            System.out.println("Trip ends at: " + trip.getDestination());
        }
    }

    public void displayVehicles()
    {
        for (Vehicle vehicle:  vehicles) {
            System.out.println("Vehicle Make: " + vehicle.getMake());
            System.out.println("Vehicle Model: " + vehicle.getModel());
        }
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "\nstart_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", \n tripRoute=" + routes.get(0).getStart_point() +
                " to " + routes.get(0).getEnd_point() +
                ", \nvehicles=" + vehicles.get(0).getMake() +
                " " + vehicles.get(0).getModel() +
                ", \ntrips=" + trips.get(0).getFrom() +
                " to " + trips.get(0).getDestination() +
                '}';
    }
}
