public class Bus extends Vehicle
{
    private String VIN;
    private String PlateNO;
    private double servicePrice;

    public Bus(String make, String model, int year, String VIN, String plateNO) {
        super(make, model, year);
        this.VIN = VIN;
        PlateNO = plateNO;
    }

    public String getVIN() {
        return VIN;
    }

    public String getPlateNO() {
        return PlateNO;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setPlateNO(String plateNO) {
        PlateNO = plateNO;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }
}
