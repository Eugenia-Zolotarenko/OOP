public class MainComputer {
    public static void main (String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer("HP", 16, "AMD Ryzen 9", 1);
        Computer comp3 = new Computer("ACER", 32, "Intel Core i9", 2);

        comp1.setCompany("Apple");
        comp1.setCpu("M5 max");
        comp1.setRam(8);
        comp1.setSdd(512);
        System.out.println();

        System.out.println("my new computer: " + comp1.getCompany()
                        + "; CPU: " + comp1.getCpu()
                        + "; RAM: " + comp1.getRam()
                        + "; SDD: " + comp1.getSdd()
                );


        System.out.println(comp2.toString());
        System.out.println("My work laptop: " + comp3.toString());


    }
}
