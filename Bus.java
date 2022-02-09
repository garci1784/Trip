public class Bus extends Vehicle
{
    private String VIN;
    private String PlateNO;

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
}
