public class Lesson_6_MainBooks {
    public static void main(String[] args) {

        Book bk = new Book("Buratino", "Tolstoy", 150, 12345);
        System.out.println(bk.toString());

        Book bk2 = new Book();
        System.out.println(bk2.toString());

    }
}
