public class SalaryEmployee extends EmployeeHW5{
    private double weekSalary;

    public SalaryEmployee() {}

    public SalaryEmployee(String name, String jobTitle, double weekSalary) {
        super(name, jobTitle);
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary >= 0)
        this.weekSalary = weekSalary;
    }

    @Override
    public double calculatePay() {
        return weekSalary;
    }
}
