public class SalesEmployee extends Employee{
    private double bonus;

    public SalesEmployee(){}

    public SalesEmployee(String name, int id, double age, String company, String time, double salary, double bonus) {
        super(name, id, age, company, time, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0)
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "; bonus: " + bonus + " Euro";
    }
}
