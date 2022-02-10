public class scheduleDriver
{
    public static void main(String[] args)
    {
        Route flightRoute = new FlightRoute("SD", "NYC", "Sunny", 13L);
        Schedule scheduleExample = new Schedule("9am", "10:30am");
        scheduleExample.addRoute(flightRoute);

        Airplane airplane = new Airplane("Boeing", "737", 1967, "narrow body", 3425);
        scheduleExample.addVehicle(airplane);

        Trip trip = new Trip("West Coast", "East Coast");
        scheduleExample.addTrips(trip);

        System.out.println("Start time: " + scheduleExample.getStart_time());
        System.out.println("End time: " + scheduleExample.getEnd_time());

        scheduleExample.displayRoutes();
        scheduleExample.displayTrips();
        scheduleExample.displayVehicles();
    }
}
