public class Lesson_6_MainBooks {
    public static void main(String[] args) {

        Book bk = new Book("Buratino", "Tolstoy", 150, 12345);
        System.out.println(bk); // =  System.out.println(bk.toString());

        FictionBook fb = new FictionBook("Vii", "Gogol", 230, 1357, "Horror");
        System.out.println(fb);

        EducationBook eb = new EducationBook("Math", "Piphagor", 300, 18975, "Geometry");
        System.out.println(eb);

        KidsFictionBook kfb = new KidsFictionBook("Kolobok", "Folklore", 40, 5678, "Fairy Tail", 1);
        System.out.println(kfb);

    }
}
