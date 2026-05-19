public class MainPersonHW4 {
    public static void main(String[] args){
        Person p1 = new Person("John Connor", 323442, 10 );
        System.out.println(p1);

        Employee ep = new Employee("John Connor", 323442, 10,
                "Cyberdyne Systems", "Full time", 2000);
        System.out.println(ep);

        SalesEmployee sep = new SalesEmployee("Sara Connor", 2134235,
                18, "Big Jeff's", "Part time", 532, 100);
        System.out.println(sep);

        SportsMan sp = new SportsMan("Michael Jordan", 235325, 63,
                "Basketball", "Shooting guard");
        System.out.println(sp);

        Patient pp = new Patient("John Doe", 3424, 56, "AJ789099877");
        System.out.println(pp);
    }
}
