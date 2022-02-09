import java.util.ArrayList;

public class Route
{
    private String start_point;
    private String end_point;

    public Route(String start_point, String end_point) {
        this.start_point = start_point;
        this.end_point = end_point;
    }

    public String getStart_point() {
        return start_point;
    }

    public String getEnd_point() {
        return end_point;
    }
}
