public abstract class Employee extends Person{
    private String company;
    private double salary;
    private String time;

    public Employee(){}

    public Employee(String name, int id, double age, String company,  String time, double salary) {
        super(name, id, age);
        this.company = company;
        this.salary = salary;
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company != null)
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary >= 0)
        this.salary = salary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if (time != null)
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + "; company: " + company + "; "  + time
                + "; salary: " + salary + " Euro";
    }

    public abstract double calculateSalary();
}
