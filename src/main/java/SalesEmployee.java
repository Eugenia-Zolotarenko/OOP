public class SalesEmployee extends Employee{
    private double bonus;
    private double totalSales;

    public SalesEmployee(){}

    public SalesEmployee(String name, int id, double age, String company,
                         String time, double salary, double bonus, double totalSales) {
        super(name, id, age, company, time, salary);
        this.bonus = bonus;
        this.totalSales = totalSales;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0)
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales >= 0)
            this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return super.toString() + "; bonus: " + bonus + " Euro";
    }

    @Override
    public double calculateSalary() {
        double salary = super.getSalary();
        double bonusMoney = (totalSales*bonus)/100;
        return salary + bonusMoney;
    }


}
