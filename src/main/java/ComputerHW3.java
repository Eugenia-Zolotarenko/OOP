public class ComputerHW3 {
    private String company;
    private int ram;
    private String cpu;
    private int ssd;

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {
        if(company != null)
        this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram >0)
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu !=null)
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if(ssd > 0)
        this.ssd = ssd;
    }
}
