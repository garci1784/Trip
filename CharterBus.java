public class CharterBus extends Bus
{
    private String employer_name;

    public CharterBus(String make, String model, int year, String VIN, String plateNO, String employer_name) {
        super(make, model, year, VIN, plateNO);
        this.employer_name = employer_name;
    }

    public String getEmployer_name() {
        return employer_name;
    }

    public void setEmployer_name(String employer_name) {
        this.employer_name = employer_name;
    }
}
