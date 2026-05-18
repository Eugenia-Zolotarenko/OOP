public class Person {
    //this - ссылка на все, что есть в классе
    private String name;
    private int id;
    private double age;

    //DEFAULT CONSTRUCTOR

    public Person() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    public void setName(String name) {
        if(name!=null)
            this.name = name;
    }

    public void setId (int id) {
        if (id>0)
            this.id = id;
    }

    public void setAge (double age) {
        if (age > 0)
            this.age = age;
    }

    //getters

    public String getName () {
        return name;
    }

    public int getId () {
        return id;
    }

    public double getAge (){
        return age;
    }


}
