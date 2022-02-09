public class Trail extends Route
{
    private String trail_name;
    private int trail_length;

    public Trail(String start_point, String end_point, String trail_name, int trail_length) {
        super(start_point, end_point);
        this.trail_name = trail_name;
        this.trail_length = trail_length;
    }

    public String getTrail_name() {
        return trail_name;
    }

    public void setTrail_name(String trail_name) {
        this.trail_name = trail_name;
    }

    public int getTrail_length() {
        return trail_length;
    }

    public void setTrail_length(int trail_length) {
        this.trail_length = trail_length;
    }
}
