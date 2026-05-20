public class MainEmployeeHW5 {
    public static void main(String[] args) {
        SalaryEmployee se = new SalaryEmployee("Sara Connor", "waiter", 532);
        HourlyEmployee he = new HourlyEmployee("Jane Fonda", "Fitness instrucktor",
                100, 40);

        System.out.println(se.getName() + ": " + se.calculatePay() + "$");
        System.out.println(he.getName() + ": " + he.calculatePay() + " Euro");

    }
}
