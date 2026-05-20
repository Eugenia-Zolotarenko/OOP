public class MainCompany {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Anna");
        p.setId(324234);
        p.setAge(23.5);

        System.out.println(p);

        SalesEmployee se = new SalesEmployee("Alex", 43456, 45, "IBM",
                                             "Full time", 3500, 2, 10000);

        System.out.println(se);
        System.out.println("Salary: " + se.calculateSalary()+ " Euro");

       /* Employee emp = new Employee("Anna", 2455, 32, "IBM",
                "Part time", 4000);

        System.out.println(emp);

        */
    }
}
