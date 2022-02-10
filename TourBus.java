public class TourBus extends Bus
{
    private String tourist_Attractions;

    public TourBus(String make, String model, int year, String VIN, String plateNO, String tourist_Attractions) {
        super(make, model, year, VIN, plateNO);
        this.tourist_Attractions = tourist_Attractions;
    }

    public String getTourist_Attractions() {
        return tourist_Attractions;
    }

    public void setTourist_Attractions(String tourist_Attractions) {
        this.tourist_Attractions = tourist_Attractions;
    }
}
