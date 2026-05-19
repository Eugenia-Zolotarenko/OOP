public class Computer {
    private String company;
    private int ram;
    private String cpu;
    private int sdd;

    public Computer () {}

    public Computer(String company, int ram, String cpu, int sdd) {
        this.company = company;
        this.ram = ram;
        this.cpu = cpu;
        this.sdd = sdd;
    }

    public String getCompany() {
        if (company.equalsIgnoreCase("apple"))
            return "Excellent choice!: " + company;
        return company;
    }

    public void setCompany(String company) {
        if (company != null)
        this.company = company;
    }

    public String getRam() {
        return Integer.toString(ram) + "GB";
    }

    public void setRam(int ram) {
        if (ram > 0)
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu != null)
            this.cpu = cpu;
    }

    public String getSdd() {
        String sddValue = "";
        if (this.sdd>= 512)
            sddValue = Integer.toString(sdd) + "GB";
        else if (sdd < 100 ) sddValue = Integer.toString(sdd) + "TB";

        return sddValue;
    }

    public void setSdd(int sdd) {
        if (sdd > 0)
        this.sdd = sdd;
    }

    @Override
    public String toString() {
        String str = "Company " + this.company
                + "; RAM: " + this.ram+ " GB;"
                + " CPU: " + this.cpu
                + "; SDD: " + getSdd();

        return str;
    }
}
