public abstract class EmployeeHW5 {
    private String name;
    private String jobTitle;

    public EmployeeHW5() {}

    public EmployeeHW5(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank())
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle != null && !jobTitle.isBlank())
        this.jobTitle = jobTitle;
    }

    public abstract double calculatePay();
}
