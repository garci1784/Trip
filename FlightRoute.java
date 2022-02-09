public class FlightRoute extends Route
{
    private String weather;
    private boolean turbulence;

    public FlightRoute(String start_point, String end_point, String weather, boolean turbulence) {
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

    public boolean isTurbulence() {
        return turbulence;
    }

    public void setTurbulence(boolean turbulence) {
        this.turbulence = turbulence;
    }
}
