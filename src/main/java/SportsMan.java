public class SportsMan extends Person{
    private String sport;
    private String status;

    public SportsMan() {}

    public SportsMan(String name, int id, double age, String sport, String status) {
        super(name, id, age);
        this.sport = sport;
        this.status = status;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        if (sport != null)
        this.sport = sport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null)
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "; sport: " + sport + "; status: " + status;
    }
}
