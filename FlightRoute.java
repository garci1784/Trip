public class FlightRoute extends Route
{
    private String weather;
    private long turbulence;

    public FlightRoute(String start_point, String end_point, String weather, long turbulence) {
        super(start_point, end_point);
        this.weather = weather;
        this.turbulence = turbulence;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public long isTurbulence() {
        return turbulence;
    }

    public void setTurbulence(long turbulence) {
        this.turbulence = turbulence;
    }
}
