public class MainComputerHW3 {
    public static void main (String[] args){
        ComputerHW3 pc = new ComputerHW3();
        pc.setCompany("Lenovo");
        pc.setRam(8);
        pc.setCpu("i7");
        pc.setSsd(500);


        System.out.println("Company: " + pc.getCompany());
        System.out.println("Ram: " + pc.getRam());
        System.out.println("Cpu: " + pc.getCpu());
        System.out.println("Ssd: " + pc.getSsd());
    }
}
