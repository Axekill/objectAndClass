package lesson;

public class Main {
    public static void main(String[] args) {
        Author authorBook1 = new Author("Николай", "Носов");
        Book book1 = new Book("Незнайка на луне", authorBook1, 2000);
        book1.setYear(2003);
        System.out.println(book1);

        System.out.println();

        Author authorBook2 = new Author("Николай", "Гоголь");
        Book book2 = new Book("Мертвые души", authorBook2, 1965);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

    }
}
