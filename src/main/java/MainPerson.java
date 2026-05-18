public class MainPerson {
    public static void main(String[] args){
        Person p1 = new Person(); // DEFAULT CONSTRUCTOR object Person
        p1.setName("Jennyfer Lopez");
        p1.setId(12234);
        p1.setAge(38.11);



        System.out.println("Name: " + p1.getName());
        System.out.println("id: " + p1.getId());
        System.out.println("Age: " + p1.getAge());

        Person p2 = new Person();
        p2.setName("Hanna Montana");
        p2.setId(12345);
        p2.setAge(34);

        System.out.println("Name: " + p2.getName());
        System.out.println("id: " + p2.getId());
        System.out.println("Age: " + p2.getAge());

    }
}
/*
object p1-> [name='Jenyfer Lopez' id=12234 age = 38.11]
object p2-> [name='Hanna Montanna' id=12345 age = 34]
 */


/*
1.
Class Computer

company(String)  "Lenovo"
ram (int)  8
cpu(String) "i5"
sdd(int)    500

setter, getter

Class MainComputer --> main
create 3 objects
use setters and getters for output


2. Advanced
 for your choose
 */