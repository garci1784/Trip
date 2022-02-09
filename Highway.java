public class Highway extends Route
{
    private String highwayName;
    private int speedLimit;

    public Highway(String start_point, String end_point, String highwayName, int speedLimit) {
        super(start_point, end_point);
        this.highwayName = highwayName;
        this.speedLimit = speedLimit;
    }

    public String getHighwayName() {
        return highwayName;
    }

    public void setHighwayName(String highwayName) {
        this.highwayName = highwayName;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
