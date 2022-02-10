public class ExpressBus extends Bus
{
    private String region_name;

    public ExpressBus(String make, String model, int year, String VIN, String plateNO, String region_name) {
        super(make, model, year, VIN, plateNO);
        this.region_name = region_name;
    }

    public String getRegion_name() {
        return region_name;
    }
}
