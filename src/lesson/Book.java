package lesson;

public class Book {
    private final String name;
    Author author;
    private int year;

    public Book(String name,Author author, int year) {
        this.author=author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

