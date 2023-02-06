package lesson;

public class Book extends Author {
    private final String name;
    private int year;
    public Book(String name, int year) {
        super("", "");
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

